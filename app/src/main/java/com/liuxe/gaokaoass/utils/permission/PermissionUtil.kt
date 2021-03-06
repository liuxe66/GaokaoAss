package com.liuxe.gaokaoass.utils.permission

import android.os.Build
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

/**
 * 权限请求
 * @Author: JokAr
 * @Date: 2019-12-11 16:09
 */

class PermissionUtil(
    var activity: FragmentActivity? = null,
    var fragment: Fragment? = null
) {
    constructor(a: FragmentActivity) : this(a, null)
    constructor(f: Fragment) : this(null, f)


    private var permissions: Array<out String>? = null
    private var grant: (() -> Unit)? = null
    private var denied: (() -> Unit)? = null
    private var neverAskAgain: (() -> Unit)? = null

    private var requestFragment: Fragment? = null
    private var fragmentManager: FragmentManager? = null

    class Builder(
        private var a: FragmentActivity?,
        private val f: Fragment?
    ) {
        constructor(activity: FragmentActivity) : this(activity, null)
        constructor(fragment: Fragment) : this(null, fragment)

        private var ps: Array<out String>? = null
        private var g: (() -> Unit)? = null
        private var d: (() -> Unit)? = null
        private var n: (() -> Unit)? = null

        fun setPermissions(vararg permissions: String): Builder {
            this.ps = permissions
            return this
        }

        fun setGrant(grant: () -> Unit): Builder {
            this.g = grant
            return this
        }

        fun setDenied(denied: () -> Unit): Builder {
            this.d = denied
            return this
        }

        fun setNeverAskAgain(neverAskAgain: () -> Unit): Builder {
            this.n = neverAskAgain
            return this
        }


        fun request() {
            PermissionUtil(a, f).apply {
                permissions = ps
                grant = g
                denied = d
                neverAskAgain = n
            }.build()
        }
    }

    private fun build() {
        if (activity == null && fragment == null) {
            throw RuntimeException("activity or fragment can't be null")
            return
        }

        if (permissions.isNullOrEmpty()) {
            throw RuntimeException("permissions can't be null")
            return
        }
        //6.0以下直接返回允许
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            grant?.invoke()
            return
        }
        //
        activity?.let {
            fragmentManager = it.supportFragmentManager
        }
        fragment?.let {
            fragmentManager = it.childFragmentManager
        }

        requestFragment = PermissionFragment.instance(
            permissions,
            {
                removeFragment()
                grant?.invoke()
            },
            {
                removeFragment()
                denied?.invoke()
            },
            {
                removeFragment()
                neverAskAgain?.invoke()
            }
        )
        requestFragment?.let { fragment ->
            fragmentManager?.run {
                beginTransaction()
                    .add(fragment, "requestPermission")
                    .commitAllowingStateLoss()
            }
        }
    }

    /**
     * 移除fragment
     */
    private fun removeFragment() {
        requestFragment?.let { it ->
            fragmentManager?.run {
                beginTransaction()
                    .remove(it)
                    .commitAllowingStateLoss()
            }
        }
    }

}
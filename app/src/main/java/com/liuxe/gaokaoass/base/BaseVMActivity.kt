package com.liuxe.gaokaoass.base

import android.text.TextUtils
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

/**
 *
 * @author  Lai
 *
 * @time 2019/9/18 13:58
 * @describe describe
 *
 */
abstract class BaseVMActivity : BaseActivity() {

    /**
     * 初始化默认的viewModel
     */
    inline fun <reified VM : BaseViewModel> createViewModel(): VM {
        val mViewModel = ViewModelProvider(this)[VM::class.java]
        mViewModel.mException.observe(this, Observer {
            toastMessage(it)
        })
        return mViewModel
    }

    open fun toastMessage(throwable: Throwable) {
        if (!TextUtils.isEmpty(throwable.message)) {
            Toast.makeText(this, throwable.message, Toast.LENGTH_LONG).show()
        }
    }

    open fun onError(throwable: Throwable) {

    }
}
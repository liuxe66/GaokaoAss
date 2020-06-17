package com.liuxe.gaokaoass.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.gyf.immersionbar.ImmersionBar
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.main.home.HomeFragment
import com.liuxe.gaokaoass.ui.main.homeleft.HomeLeftFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseVMActivity() {
    var vpAdapter: MainVpAdapter? = null
    var fragmentList: ArrayList<Fragment> = ArrayList()


    override fun getLayout() = com.liuxe.gaokaoass.R.layout.activity_main

    override fun init(savedInstanceState: Bundle?) {

        val recyclerView = getPrivateValue(vp_main, "mRecyclerView") as RecyclerView
        if (recyclerView != null) {
            recyclerView.overScrollMode = View.OVER_SCROLL_NEVER
        }

        fragmentList.add(HomeLeftFragment())
        fragmentList.add(HomeFragment())

        vpAdapter = MainVpAdapter(this,fragmentList)

        vp_main.adapter = vpAdapter
        vp_main.setCurrentItem(1,false)


    }

    override fun initStatusBar() {
        ImmersionBar.with(this)
            .statusBarDarkFont(true)
            .keyboardEnable(true).init()
    }

    public fun switchLeft(){
        vp_main.currentItem = 0
    }
    public fun switchHome(){
        vp_main.currentItem = 1
    }

    /**
     * 通过反射获取私有的成员变量
     *
     * @param object
     * @return
     */
    private fun getPrivateValue(`object`: Any, fieldName: String): Any? {

        try {
            val field = `object`.javaClass.getDeclaredField(fieldName)
            // 参数值为true，打开禁用访问控制检查
            //setAccessible(true) 并不是将方法的访问权限改成了public，而是取消java的权限控制检查。
            //所以即使是public方法，其accessible 属相默认也是false
            field.isAccessible = true
            return field.get(`object`)
        } catch (e: Exception) {
            return null
        }
    }
}

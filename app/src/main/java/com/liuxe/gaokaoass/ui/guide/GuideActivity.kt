package com.liuxe.gaokaoass.ui.guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.guide.fragment.GuideFaqFragment
import com.liuxe.gaokaoass.ui.guide.fragment.GuideGlossaryFragment
import com.liuxe.gaokaoass.ui.guide.fragment.GuidePolicyFragment
import kotlinx.android.synthetic.main.activity_guide.*

class GuideActivity : BaseVMActivity() {

    override fun getLayout() = R.layout.activity_guide

    var fragmentList:ArrayList<Fragment> = ArrayList()

    var tabArr = arrayOf("政策解读","FAQ","名词解释")

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"填报指南")
        fragmentList.add(GuidePolicyFragment())
        fragmentList.add(GuideFaqFragment())
        fragmentList.add(GuideGlossaryFragment())
        initViewPager()
    }

    private fun initViewPager() {
        vp_content.adapter = VpAdapter(this)
        vp_content.offscreenPageLimit = fragmentList.size
        TabLayoutMediator(tab_layout, vp_content) { tab, position ->
            tab.text = tabArr[position]
        }.attach()
    }

    inner class VpAdapter(act:FragmentActivity):FragmentStateAdapter(act) {
        override fun getItemCount() = 3

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }
    }
}
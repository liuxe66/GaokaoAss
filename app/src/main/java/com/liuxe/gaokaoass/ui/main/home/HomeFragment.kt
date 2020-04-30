package com.liuxe.gaokaoass.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.ui.careerquiz.CareerActivity
import com.liuxe.gaokaoass.ui.main.MainActivity
import com.liuxe.gaokaoass.ui.zntb.ZntbHomeActivity
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment :BaseVMFragment(),View.OnClickListener{


    var mainActivity:MainActivity? = null
    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun init(savedInstanceState: Bundle?) {
        mainActivity = requireActivity() as MainActivity
        StatusBarUtils.setPaddingTop(requireActivity(),status_bar)

        fl_home_left.setOnClickListener(this)
        tv_xgcs.setOnClickListener(this)
        rl_zntb.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.rl_zntb -> startActivity(Intent(requireContext(),ZntbHomeActivity::class.java))
            R.id.fl_home_left -> mainActivity!!.switchLeft()
            R.id.tv_xgcs -> startActivity(Intent(requireActivity(),CareerActivity::class.java))
        }
    }
}
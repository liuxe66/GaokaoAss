package com.liuxe.gaokaoass.ui.main.home

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.ui.careerquiz.CareerActivity
import com.liuxe.gaokaoass.ui.main.MainActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.ui.zntb.ZntbHomeActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import com.liuxe.gaokaoass.utils.TopImageUtil
import kotlinx.android.synthetic.main.home_fragment.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : BaseVMFragment(), View.OnClickListener {
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: String by Preference(Preference.SCORE, "")


    var mainActivity: MainActivity? = null
    var homeFragmentViewModel: HomeFragmentViewModel? = null
    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun init(savedInstanceState: Bundle?) {
        mainActivity = requireActivity() as MainActivity
        StatusBarUtils.setPaddingTop(requireActivity(),status_bar)

        homeFragmentViewModel = createViewModel()
        homeFragmentViewModel?.getCountDownTime()
        homeFragmentViewModel?.mCountDownTime?.observe(this,androidx.lifecycle.Observer {
            var bitmap = TopImageUtil.drawTextToBitmap(requireActivity(),R.drawable.ic_home_top,it)
            iv_top.setImageBitmap(bitmap)
        })

        fl_home_left.setOnClickListener(this)
        tv_xgcs.setOnClickListener(this)
        rl_zntb.setOnClickListener(this)
        tv_lqyc.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.rl_zntb ->

                if (subject == "" || location == "" || score == "") {
                    startActivity(
                        Intent(
                            requireContext(),
                            ScoreActivity::class.java
                        )
                    )
                } else {
                    startActivity(
                        Intent(
                            requireContext(),
                            ZntbHomeActivity::class.java
                        )
                    )
                }


            R.id.fl_home_left -> mainActivity!!.switchLeft()
            R.id.tv_xgcs -> startActivity(
                Intent(
                    requireActivity(),
                    CareerActivity::class.java
                )
            )
        }
    }


}
package com.liuxe.gaokaoass.ui.main.home

import android.content.Intent
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.ui.careerquiz.CareerActivity
import com.liuxe.gaokaoass.ui.guide.GuideActivity
import com.liuxe.gaokaoass.ui.main.MainActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.ui.zntb.ZntbActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import com.liuxe.gaokaoass.utils.TopImageUtil
import kotlinx.android.synthetic.main.home_fragment.*


class HomeFragment : BaseVMFragment() {
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)


    var mainActivity: MainActivity? = null
    var homeFragmentViewModel: HomeFragmentViewModel? = null
    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun init(savedInstanceState: Bundle?) {
        mainActivity = requireActivity() as MainActivity
        StatusBarUtils.setPaddingTop(requireActivity(), status_bar)
        homeFragmentViewModel = createViewModel()
        homeFragmentViewModel?.getCountDownTime()
        homeFragmentViewModel?.mCountDownTime?.observe(this, androidx.lifecycle.Observer {
            val bitmap =
                TopImageUtil.drawTextToBitmap(requireActivity(), R.drawable.ic_home_top, it)
            iv_top.setImageBitmap(bitmap)
        })

        fl_home_left.setOnClickListener{mainActivity!!.switchLeft()}
        tv_zycp.setOnClickListener{
            startActivity(Intent(requireActivity(), CareerActivity::class.java))
        }
        rl_zntb.setOnClickListener{
            if (subject == "" || location == "" || score == 0) {
                startActivity(Intent(requireContext(), ScoreActivity::class.java))
            } else {
                startActivity(Intent(requireContext(), ZntbActivity::class.java))
            }
        }
        tv_skx.setOnClickListener{

        }
        tv_tbzn.setOnClickListener {
            startActivity(Intent(requireActivity(), GuideActivity::class.java))
        }

    }

    override fun onSupportVisible() {
        super.onSupportVisible()
        homeFragmentViewModel?.getCountDownTime()
    }

}
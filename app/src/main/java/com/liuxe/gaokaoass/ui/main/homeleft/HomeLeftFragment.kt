package com.liuxe.gaokaoass.ui.main.homeleft

import android.content.Intent
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.ui.main.MainActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.home_left_fragment.*


class HomeLeftFragment : BaseVMFragment() {
    var mainActivity: MainActivity? = null
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: String by Preference(Preference.SCORE, "")

    override fun getLayoutId(): Int = R.layout.home_left_fragment

    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(requireActivity(), status_bar)
        mainActivity = requireActivity() as MainActivity
        tv_prov.text = location
        tv_subject.text = subject
        tv_score.text = score

        ll_edit.setOnClickListener {
            startActivity(Intent(requireActivity(), ScoreActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        tv_prov.text = location
        tv_subject.text = subject
        tv_score.text = score
    }

    override fun onBackPressedSupport(): Boolean {
        mainActivity!!.switchHome()
        return true
    }
}
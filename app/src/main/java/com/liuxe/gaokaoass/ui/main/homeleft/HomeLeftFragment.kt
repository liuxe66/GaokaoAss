package com.liuxe.gaokaoass.ui.main.homeleft

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.ui.AboutUsActivity
import com.liuxe.gaokaoass.ui.main.MainActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import com.liuxe.gaokaoass.utils.clickWithTrigger
import kotlinx.android.synthetic.main.home_left_fragment.*


class HomeLeftFragment : BaseVMFragment() {
    var mainActivity: MainActivity? = null
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    override fun getLayoutId(): Int = R.layout.home_left_fragment

    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(requireActivity(), status_bar)
        mainActivity = requireActivity() as MainActivity
        tv_prov.text = location
        tv_subject.text = subject
        tv_score.text = score.toString()

        ll_edit.setOnClickListener {
            startActivity(Intent(requireActivity(), ScoreActivity::class.java))
        }

        ll_ydy.clickWithTrigger {
            openQQ()
        }

        ll_zyjc.clickWithTrigger {
            startActivity(Intent(requireActivity(), AboutUsActivity::class.java))
        }

    }

    //打开QQ
    private fun openQQ() {
        try {
            val url = "mqqwpa://im/chat?chat_type=wpa&uin=1994915960"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (e: Exception) {
            e.printStackTrace()
            toast("请检查是否安装QQ")
        }
    }

    override fun onResume() {
        super.onResume()
        tv_prov.text = location
        tv_subject.text = subject
        tv_score.text = score.toString()
    }

    override fun onBackPressedSupport(): Boolean {
        mainActivity!!.switchHome()
        return true
    }
}
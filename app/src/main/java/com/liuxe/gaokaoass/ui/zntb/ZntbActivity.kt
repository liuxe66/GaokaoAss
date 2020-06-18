package com.liuxe.gaokaoass.ui.zntb

import android.content.Intent
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.ui.zntb.college.ZntbHomeCollegeActivity
import com.liuxe.gaokaoass.ui.zntb.major.ZntbQueryMajorActivity
import com.liuxe.gaokaoass.utils.Preference
import kotlinx.android.synthetic.main.activity_zntb.*

class ZntbActivity : BaseVMActivity() {

    override fun getLayout() = R.layout.activity_zntb
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    override fun onResume() {
        super.onResume()
        tv_user.text = location + " · " + subject + " · " + score + "分"
    }

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar, "智能填报")
        ll_college.setOnClickListener {
            startActivity(Intent(this,ZntbHomeCollegeActivity::class.java))
        }
        ll_major.setOnClickListener {
            startActivity(Intent(this,ZntbQueryMajorActivity::class.java))
        }
        ll_user.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ScoreActivity::class.java
                )
            )
        }
    }
}
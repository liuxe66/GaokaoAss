package com.liuxe.gaokaoass.ui.zntb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.score.ScoreActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.activity_zntb_home.*

class ZntbHomeActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_zntb_home

    var mZntbHomeViewModel: ZntbHomeViewModel? = null
    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    override fun onResume() {
        super.onResume()
        tv_user.text = location + " · " + subject + " · " + score + "分"
    }
    override fun init(savedInstanceState: Bundle?) {

        initTitleBar(toolbar, "智能填报志愿")

        mZntbHomeViewModel = createViewModel()
        mZntbHomeViewModel?.getZntbHome(location, subject, score)

        mZntbHomeViewModel?.zntbHomeResponse?.observe(this, Observer {
            tv_risk_title.text = it.data.risky.name
            tv_risk_proba.text = "录取概率" + it.data.risky.prob
            tv_risk_college.text = it.data.risky.numbers.toString() + "所"

            tv_ok_title.text = it.data.safety.name
            tv_ok_proba.text = "录取概率" + it.data.safety.prob
            tv_ok_college.text = it.data.safety.numbers.toString() + "所"

            tv_backup_title.text = it.data.guaranteed.name
            tv_backup_proba.text = "录取概率" + it.data.guaranteed.prob
            tv_backup_college.text = it.data.guaranteed.numbers.toString() + "所"

            ll_risk.visibility = View.VISIBLE
            ll_ok.visibility = View.VISIBLE
            ll_backup.visibility = View.VISIBLE
        })

        ll_risk.setOnClickListener {
            val risk = Intent(this, ZntbCollegeActivity::class.java)
            risk.putExtra("tab", 1)
            startActivity(risk)
        }

        ll_ok.setOnClickListener {
            val risk = Intent(this, ZntbCollegeActivity::class.java)
            risk.putExtra("tab", 2)
            startActivity(risk)
        }

        ll_backup.setOnClickListener {
            val risk = Intent(this, ZntbCollegeActivity::class.java)
            risk.putExtra("tab", 3)
            startActivity(risk)
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

package com.liuxe.gaokaoass.ui.zntb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.activity_zntb_home.*

class ZntbHomeActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_zntb_home

    var mZntbHomeViewModel:ZntbHomeViewModel? = null
    var subject:String by Preference(Preference.SUBJECT,"")
    var location:String by Preference(Preference.LOCATION,"")
    var score:String by Preference(Preference.SCORE,"")

    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(this,toolbar)
        initTitleBar(toolbar,"智能填报志愿")
        tv_user.text = location+" · "+subject+" · "+score
        mZntbHomeViewModel = createViewModel()
        mZntbHomeViewModel?.getZntbHome(location,subject,score,"2020")

        mZntbHomeViewModel?.zntbHomeResponse?.observe(this, Observer {
            tv_risk_title.text = it.data.risk.name
            tv_risk_proba.text = it.data.risk.admission_proba
            tv_risk_college.text = it.data.risk.numbers.toString() + "所"

            tv_ok_title.text = it.data.ok.name
            tv_ok_proba.text = it.data.ok.admission_proba
            tv_ok_college.text = it.data.ok.numbers.toString() + "所"

            tv_backup_title.text = it.data.backup.name
            tv_backup_proba.text = it.data.backup.admission_proba
            tv_backup_college.text = it.data.backup.numbers.toString() + "所"

            ll_risk.visibility = View.VISIBLE
            ll_ok.visibility = View.VISIBLE
            ll_backup.visibility = View.VISIBLE
        })

        ll_risk.setOnClickListener {
            val risk = Intent(this,ZntbCollegeActivity::class.java)
            risk.putExtra("shock","1")
            startActivity(risk)
        }

        ll_ok.setOnClickListener {
            val risk = Intent(this,ZntbCollegeActivity::class.java)
            risk.putExtra("shock","2")
            startActivity(risk)
        }

        ll_backup.setOnClickListener {
            val risk = Intent(this,ZntbCollegeActivity::class.java)
            risk.putExtra("shock","3")
            startActivity(risk)
        }

    }

}

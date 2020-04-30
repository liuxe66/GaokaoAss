package com.liuxe.gaokaoass.ui.careerquiz

import android.content.Intent
import android.os.Bundle
import com.liuxe.gaokaoass.ui.careerquiz.hld.HldQActivity
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.hld.HldResultActivity
import com.liuxe.gaokaoass.ui.careerquiz.mbti.MbtiQActivity
import com.liuxe.gaokaoass.ui.careerquiz.mbti.MbtiResultActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.activity_career_home.*
import kotlinx.android.synthetic.main.activity_career_home.toolbar

class CareerActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_career_home
    var hld_result: String by Preference(Preference.HLD_CAREER_RESULT, "")
    var mbti_result: String by Preference(Preference.MBTI_CAREER_RESULT, "")
    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"职业测评")
        StatusBarUtils.setPaddingTop(this,toolbar)

        ll_hld.setOnClickListener {
            if (hld_result == ""){
                startActivity(Intent(this@CareerActivity, HldQActivity::class.java))
            } else{
                val result = Intent(this, HldResultActivity::class.java)
                startActivity(result)
            }
        }
        ll_mbti.setOnClickListener {
            if (mbti_result == ""){
                startActivity(Intent(this@CareerActivity, MbtiQActivity::class.java))
            } else{
                val result = Intent(this, MbtiResultActivity::class.java)
                startActivity(result)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (hld_result == ""){
            iv_hld.setImageResource(R.drawable.ic_no_result)
        } else{
            iv_hld.setImageResource(R.drawable.ic_has_result)
        }
        if (mbti_result == ""){
            iv_mbti.setImageResource(R.drawable.ic_no_result)
        } else{
            iv_mbti.setImageResource(R.drawable.ic_has_result)
        }
    }


}

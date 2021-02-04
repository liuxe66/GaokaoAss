package com.liuxe.gaokaoass.ui.careerquiz.hld

import android.content.Intent
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import kotlinx.android.synthetic.main.activity_hld_intro.*

class HldIntroActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_hld_intro

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"霍兰德职业兴趣测试")
        tv_submit.setOnClickListener {
            val question = Intent(this,HldQActivity::class.java)
            startActivity(question)
        }
    }

}

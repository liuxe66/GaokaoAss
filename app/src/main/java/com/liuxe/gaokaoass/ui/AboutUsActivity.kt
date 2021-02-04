package com.liuxe.gaokaoass.ui

import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseActivity
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_about_us

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"关于我们")
    }
}
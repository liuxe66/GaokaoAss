package com.liuxe.gaokaoass.ui.score

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import com.gyf.immersionbar.ImmersionBar
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.widget.dialog.DialogItemClickListener
import com.liuxe.gaokaoass.widget.dialog.ProvDialog
import kotlinx.android.synthetic.main.activity_score.*


open class ScoreActivity : BaseVMActivity() {

    override fun getLayout(): Int = R.layout.activity_score

    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    override fun initStatusBar() {
        ImmersionBar.with(this)
            .statusBarView(status_bar)
            .statusBarDarkFont(true)
            .fullScreen(true)
            .init()
    }

    override fun init(savedInstanceState: Bundle?) {

        if (score != 0){
            et_score.setText(score.toString())
            et_score.setSelection(score.toString().length)
        } 

        tv_prov.text = location

        if (subject == "理科") {
            rb_li.isChecked = true
        } else if (subject == "文科") {
            rb_wen.isChecked = true
        }

        tv_prov.setOnClickListener {
            var provDailog: ProvDialog = ProvDialog(this@ScoreActivity, location)
            provDailog.show()
            provDailog.itemClickListener = object : DialogItemClickListener {
                override fun onItemClick(prov: String) {
                    location = prov
                    tv_prov.text = location
                }
            }
        }

        rg_subject.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.rb_li -> subject = "理科"
                R.id.rb_wen -> subject = "文科"
            }
        }

        et_score.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!TextUtils.isEmpty(p0)) {
                    score = p0.toString().toInt()
                }
            }

        })

        et_score.setOnEditorActionListener(TextView.OnEditorActionListener { textView, i, keyEvent ->
            when(i){
                EditorInfo.IME_ACTION_GO -> {
                    hideInput()
                    finish()
                }

            }

            return@OnEditorActionListener false
        })

        tv_submit.setOnClickListener {
            hideInput()
            finish()
        }
    }

    /**
     * 隐藏键盘
     */
    private fun hideInput() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        val v = window.peekDecorView()
        if (null != v) {
            imm.hideSoftInputFromWindow(v.windowToken, 0)
        }
    }

}

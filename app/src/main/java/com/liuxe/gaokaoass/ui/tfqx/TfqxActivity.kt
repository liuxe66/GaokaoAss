package com.liuxe.gaokaoass.ui.tfqx

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.tfqx.adapter.GoCityAdapter
import com.liuxe.gaokaoass.ui.tfqx.adapter.GoCollegeAdapter
import com.liuxe.gaokaoass.ui.tfqx.adapter.GoMajorAdapter
import com.liuxe.gaokaoass.utils.Preference
import kotlinx.android.synthetic.main.activity_tfqx.*

class TfqxActivity : BaseVMActivity() {

    override fun getLayout() = R.layout.activity_tfqx

    lateinit var viewModel: TfqxViewModel

    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"同分去向")
        viewModel = createViewModel()
        tv_user.text = location + " · " + subject + " · " + score + "分"

        viewModel.getExamineeGo()
        viewModel.tfqxData.observe(this, Observer {
            tv_score_rank.text = it.student_rank.toString()

            ll_college.visibility = View.VISIBLE
            ll_major.visibility = View.VISIBLE
            ll_city.visibility = View.VISIBLE

            recycler_college.layoutManager = LinearLayoutManager(this)
            recycler_college.adapter = GoCollegeAdapter(it.examinee_go.go_colleges)

            recycler_major.layoutManager = LinearLayoutManager(this)
            recycler_major.adapter = GoMajorAdapter(it.examinee_go.go_major)

            recycler_city.layoutManager = LinearLayoutManager(this)
            recycler_city.adapter = GoCityAdapter(it.examinee_go.go_city)
        })
    }


}
package com.liuxe.gaokaoass.ui.scorepart

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.widget.dialog.DialogItemClickListener
import com.liuxe.gaokaoass.widget.dialog.TopDialog
import kotlinx.android.synthetic.main.activity_score_part.*

class ScorePartActivity : BaseVMActivity() {

    override fun getLayout() = R.layout.activity_score_part

    var subjectPre: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")

    var subject: String = subjectPre
    var province: String = location
    var year: String = "2019"

    var provDialog: TopDialog? = null
    var yearDialog: TopDialog? = null
    var subjectDialog: TopDialog? = null

    private lateinit var viewModel: ScorePartViewModel
    private var adapter:ScorePartAdapter? = null

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"一分一段")
        viewModel = createViewModel()
        initDialog()

        recycler_score.layoutManager = LinearLayoutManager(this)


        viewModel.scorePartResponse.observe(this, Observer {
            if (recycler_score.adapter == null){
                adapter = ScorePartAdapter(it.scores_and_ranks)
                recycler_score.adapter = adapter
            } else {
                adapter?.setList(it.scores_and_ranks)
            }

        })
    }

    private fun initDialog() {


        val provArr = arrayOf(
            "河南","上海", "云南", "内蒙古", "北京", "吉林", "四川", "天津", "宁夏", "安徽",
            "山东", "山西", "广东", "广西", "新疆", "江苏", "江西", "河北",  "浙江", "海南", "湖北",
            "湖南", "甘肃", "福建", "西藏", "贵州", "辽宁", "重庆", "陕西", "青海", "黑龙江"
        )

        province = location
        tv_prov.text = province
        provDialog = TopDialog(this, "选择省份", province, provArr.toList())

        provDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                province = item
                tv_prov.text = province
                loadData()
            }
        }

        val yearArr = arrayOf("2020","2019", "2018", "2017", "2016", "2015")
        year = "2019"
        tv_year.text = year
        yearDialog = TopDialog(this, "选择年份", year, yearArr.toList())
        yearDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                year = item
                tv_year.text = year
                loadData()
            }
        }

        val subjectArr = arrayOf("理科", "文科")
        subject = subjectPre
        tv_subject.text = subject
        subjectDialog = TopDialog(this, "选择层次", subject, subjectArr.toList())
        subjectDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                subject = item
                tv_subject.text = subject
                loadData()
            }
        }

        initTips()
        loadData()
    }

    private fun loadData() {
        viewModel.getScoreRank(subject,year,province)
    }

    private fun initTips() {

        fl_prov.setOnClickListener {
            provDialog?.show()
        }

        fl_year.setOnClickListener {
            yearDialog?.show()
        }

        fl_subject.setOnClickListener {
            subjectDialog?.show()
        }

    }

}
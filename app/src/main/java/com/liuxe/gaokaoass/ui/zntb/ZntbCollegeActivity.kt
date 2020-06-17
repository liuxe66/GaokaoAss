package com.liuxe.gaokaoass.ui.zntb

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.gyf.immersionbar.ImmersionBar
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.widget.dialog.DialogItemClickListener
import com.liuxe.gaokaoass.widget.dialog.TopDialog
import kotlinx.android.synthetic.main.activity_zntb_college.*


class ZntbCollegeActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_zntb_college

    var mZntbCollegeViewModel: ZntbCollegeViewModel? = null
    var collegeAdapter: ZntbCollegeAdapter? = null
    var list: List<ZntbCollegesBean.CollegesBean> = ArrayList()
    var layoutManager: LinearLayoutManager? = null

    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)
    var tab: Int  = 1
    var city: String = ""
    var type: String = ""
    var tags: String = ""
    var ranks: String = ""

    var cityDialog: TopDialog? = null
    var typeDialog: TopDialog? = null
    var tagsDialog: TopDialog? = null
    var rankDialog: TopDialog? = null


    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar, "智能填报志愿")
        tab = intent.getIntExtra("tab",1)

        layoutManager = LinearLayoutManager(this)
        layoutManager?.orientation = LinearLayoutManager.VERTICAL
        recycler_college.layoutManager = layoutManager

        mZntbCollegeViewModel = createViewModel()
        loadData()
        mZntbCollegeViewModel?.zntbCollegesResponse?.observe(this, Observer {
            list = if (it.isNotEmpty()) {
                it
            } else {
                ArrayList()
            }
            if (collegeAdapter == null){
                collegeAdapter = ZntbCollegeAdapter(list as MutableList<ZntbCollegesBean.CollegesBean>)
                recycler_college.adapter = collegeAdapter
            } else {
                collegeAdapter!!.setList(list as MutableList<ZntbCollegesBean.CollegesBean>)
            }


        })

        mZntbCollegeViewModel!!.zntbResponse.observe(this, Observer {
            if (city == "" && type == "" && tags == "" && ranks == "") {
                initBottomDialog(it)
            }
        })

        refresh_layout.setEnableRefresh(false)
        refresh_layout.setOnLoadMoreListener {
            loadNextData()
            refresh_layout.finishLoadMore()
        }

    }

    private fun initBottomDialog(zntbCollegesBean: ZntbCollegesBean) {
        var cityList: ArrayList<String> = ArrayList()
        cityList = zntbCollegesBean.city as ArrayList<String>
        cityList.add(0, "不限")
        cityDialog = TopDialog(this, "选择地区", city, cityList)

        cityDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                if (item == "不限") {
                    city = ""
                    tv_city.text = "地区"
                } else {
                    city = item
                    tv_city.text = city
                }
                loadData()
            }
        }

        var typeList: ArrayList<String> = ArrayList()
        typeList = zntbCollegesBean.types as ArrayList<String>
        typeList.add(0, "不限")
        typeDialog = TopDialog(this, "选择类型", type, typeList)
        typeDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                if (item == "不限") {
                    type = ""
                    tv_city.text = "类型"
                } else {
                    type = item
                    tv_type.text = type
                }
                loadData()
            }
        }

        var tagsList: ArrayList<String> = ArrayList()
        tagsList = zntbCollegesBean.tags as ArrayList<String>
        tagsList.add(0, "不限")
        tagsDialog = TopDialog(this, "选择层次", tags, tagsList)
        tagsDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                if (item == "不限") {
                    tags = ""
                    tv_city.text = "层次"
                } else {
                    tags = item
                    tv_tags.text = tags
                }
                loadData()
            }
        }

        var rankList: ArrayList<String> = ArrayList()
        rankList = zntbCollegesBean.batchs as ArrayList<String>
        rankList.add(0, "不限")
        rankDialog = TopDialog(this, "选择批次", ranks, rankList)
        rankDialog?.itemClickListener = object : DialogItemClickListener {
            override fun onItemClick(item: String) {

                if (item == "不限") {
                    ranks = ""
                    tv_pici.text = "批次"
                } else {
                    ranks = item
                    tv_pici.text = ranks
                }
                loadData()
            }
        }

        initTips()
    }

    private fun initTips() {

        fl_city.setOnClickListener {
            cityDialog?.show()
        }

        fl_type.setOnClickListener {
            typeDialog?.show()
        }

        fl_tags.setOnClickListener {
            tagsDialog?.show()
        }

        fl_pici.setOnClickListener {
            rankDialog?.show()
        }
    }

    private fun loadData() {
        mZntbCollegeViewModel?.getZntbCollege(
            location,
            subject,
            score,
            tab,
            city,
            type,
            tags,
            ranks
        )
    }

    private fun loadNextData() {
        mZntbCollegeViewModel?.getZntbNextCollege(
            location,
            subject,
            score,
            1,
            city,
            type,
            tags,
            ranks
        )
    }


}

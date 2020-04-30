package com.liuxe.gaokaoass.ui.careerquiz

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.MajorBean
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.activity_hld_major.*

class MajorActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_hld_major

    var type: String = ""
    var data: List<MajorBean.DataBean> = ArrayList()
    var majorAdapter: MajorAdapter? = null
    var majorBean: MajorBean =
        MajorBean()
    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(this,toolbar)
        initTitleBar(toolbar,"专业推荐")
        type = intent.getStringExtra("type")
        majorAdapter = MajorAdapter(data)
        recycler_major.layoutManager = LinearLayoutManager(this)
        recycler_major.adapter = majorAdapter



        when (type) {
            "R" -> {
                val majorBeanStr = JsonUtils.getJson(this, "R.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "I" -> {
                val majorBeanStr = JsonUtils.getJson(this, "I.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "A" -> {
                val majorBeanStr = JsonUtils.getJson(this, "A.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "S" -> {
                val majorBeanStr = JsonUtils.getJson(this, "S.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "E" -> {
                val majorBeanStr = JsonUtils.getJson(this, "E.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "C" -> {
                val majorBeanStr = JsonUtils.getJson(this, "C.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }

        }
    }


}

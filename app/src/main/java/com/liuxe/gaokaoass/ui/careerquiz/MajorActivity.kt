package com.liuxe.gaokaoass.ui.careerquiz

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.MajorBean
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultMsgBean
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
                val majorBeanStr = JsonUtils.getJson(this, "hld/R.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "I" -> {
                val majorBeanStr = JsonUtils.getJson(this, "hld/I.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "A" -> {
                val majorBeanStr = JsonUtils.getJson(this, "hld/A.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "S" -> {
                val majorBeanStr = JsonUtils.getJson(this, "hld/S.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "E" -> {
                val majorBeanStr = JsonUtils.getJson(this, "hld/E.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "C" -> {
                val majorBeanStr = JsonUtils.getJson(this, "hld/C.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ENFJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ENFJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ENFP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ENFP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)

            }
            "ENTJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ENTJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ENTP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ENTP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ESFJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ESFJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ESFP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ESFP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ESTJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ESTJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ESTP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ESTP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "INFJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/INFJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "INFP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/INFP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "INTJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/INTJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "INTP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/INTP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ISFJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ISFJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ISFP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ISFP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ISTJ" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ISTJ.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
            "ISTP" -> {
                val majorBeanStr = JsonUtils.getJson(this, "mbti/major/ISTP.json")
                majorBean = Gson().fromJson(majorBeanStr, MajorBean::class.java)
                majorAdapter?.setNewData(majorBean.data)
            }
        }
    }


}

package com.liuxe.gaokaoass.ui.careerquiz.mbti

import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultBean
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultMsgBean
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import kotlinx.android.synthetic.main.activity_mbti_result.*

class MbtiResultActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_mbti_result
    var mbti_result: String by Preference(Preference.MBTI_CAREER_RESULT, "")
    var mbtiCode: String = ""
    var mbtiResultBean = MbtiResultBean()
    var mbtiResultMsg = MbtiResultMsgBean()
    var mbtiInfo = MbtiResultMsgBean.DataBean.InfoBean()

    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(this,toolbar)
        initTitleBar(toolbar,"MBTI测评结果")
        mbtiResultBean = Gson().fromJson<MbtiResultBean>(mbti_result, MbtiResultBean::class.java)

        progress_e.progress = mbtiResultBean.scoreE
        progress_i.progress = mbtiResultBean.scoreI
        progress_s.progress = mbtiResultBean.scoreS
        progress_n.progress = mbtiResultBean.scoreN
        progress_t.progress = mbtiResultBean.scoreT
        progress_f.progress = mbtiResultBean.scoreF
        progress_j.progress = mbtiResultBean.scoreJ
        progress_p.progress = mbtiResultBean.scoreP

        handleMbtiCode()

        //重做 清空本地数据，关闭
        tv_again.setOnClickListener {
            mbti_result = ""
            finish()
        }

        //查看专业
        tv_zy.setOnClickListener {

        }
    }

    private fun handleMbtiCode() {
        if (mbtiResultBean.scoreE > mbtiResultBean.scoreI) {
            mbtiCode += "E".toString()
        } else {
            mbtiCode += "I".toString()
        }

        if (mbtiResultBean.scoreS > mbtiResultBean.scoreN) {
            mbtiCode += "S".toString()
        } else {
            mbtiCode += "N".toString()
        }

        if (mbtiResultBean.scoreT > mbtiResultBean.scoreF) {
            mbtiCode += "T".toString()
        } else {
            mbtiCode += "F".toString()
        }

        if (mbtiResultBean.scoreJ > mbtiResultBean.scoreP) {
            mbtiCode += "J".toString()
        } else {
            mbtiCode += "P".toString()
        }

        Log.e("LLL", "mbtiCode:" + mbtiCode)
        when (mbtiCode) {
            "ENFJ" -> {
                //拿到mbti结论
                val resultMsgStr = JsonUtils.getJson(this, "ENFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ENFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ENTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ENTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ESFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ESFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ESTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ESTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "INFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "INFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "INTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "INTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ISFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ISFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ISTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "ISTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }

        }

        setupView()

    }

    private fun setupView() {
        ll_scroll.visibility = View.VISIBLE

        mbtiInfo = mbtiResultMsg.data.info[0]

        tv_result_title.text = mbtiInfo.type_name
        tv_result_simple.text = mbtiInfo.jieshao

        var mbtiResultInfotAdapter = MbtiResultInfotAdapter(mbtiInfo.infos)
        lv_mbti_result.adapter = mbtiResultInfotAdapter
    }

}

package com.liuxe.gaokaoass.ui.careerquiz.mbti

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.MajorActivity
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
        StatusBarUtils.setPaddingTop(this, toolbar)
        initTitleBar(toolbar, "MBTI测评结果")
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
            val major = Intent(
                this,
                MajorActivity::class.java
            )
            major.putExtra("type", mbtiCode)
            startActivity(major)
        }
    }

    private fun handleMbtiCode() {
        mbtiCode += if (mbtiResultBean.scoreE > mbtiResultBean.scoreI) {
            "E"
        } else {
            "I"
        }

        mbtiCode += if (mbtiResultBean.scoreS > mbtiResultBean.scoreN) {
            "S"
        } else {
            "N"
        }

        mbtiCode += if (mbtiResultBean.scoreT > mbtiResultBean.scoreF) {
            "T"
        } else {
            "F"
        }

        mbtiCode += if (mbtiResultBean.scoreJ > mbtiResultBean.scoreP) {
            "J"
        } else {
            "P"
        }

        Log.e("LLL", "mbtiCode:" + mbtiCode)
        when (mbtiCode) {
            "ENFJ" -> {
                //拿到mbti结论
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ENFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ENFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ENTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ENTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ENTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ESFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ESFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ESTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ESTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ESTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/INFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/INFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/INTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "INTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/INTP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISFJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ISFJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISFP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ISFP_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISTJ" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ISTJ_INFO.json")
                mbtiResultMsg = Gson().fromJson(resultMsgStr, MbtiResultMsgBean::class.java)

            }
            "ISTP" -> {
                val resultMsgStr = JsonUtils.getJson(this, "mbti/info/ISTP_INFO.json")
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

        val mbtiResultInfotAdapter = MbtiResultInfotAdapter(mbtiInfo.infos)
        lv_mbti_result.adapter = mbtiResultInfotAdapter
    }

}

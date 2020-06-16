package com.liuxe.gaokaoass.ui.careerquiz.mbti

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiABean
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiAItemBean
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiQBean
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultBean
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.StatusBarUtils
import com.liuxe.gaokaoass.utils.clickWithTrigger
import kotlinx.android.synthetic.main.activity_mbti_q.*
import kotlinx.android.synthetic.main.activity_mbti_q.status_bar
import kotlinx.android.synthetic.main.activity_mbti_q.tv_prev
import kotlinx.android.synthetic.main.activity_mbti_q.tv_question

class MbtiQActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_mbti_q
    var mbtiQBean = MbtiQBean()
    var mbtiABean = MbtiABean()
    var position = 0
    var listAnswer: ArrayList<MbtiAItemBean> = ArrayList()

    var scoreE: Int = 0
    var scoreI: Int = 0
    var scoreS: Int = 0
    var scoreN: Int = 0
    var scoreT: Int = 0
    var scoreF: Int = 0
    var scoreJ: Int = 0
    var scoreP: Int = 0

    var mbti_result: String by Preference(Preference.MBTI_CAREER_RESULT, "")

    override fun init(savedInstanceState: Bundle?) {
        StatusBarUtils.setPaddingTop(this, status_bar)

        val mbtiQStr = JsonUtils.getJson(this, "mbti/MBTIQ.json")
        mbtiQBean = Gson().fromJson<MbtiQBean>(mbtiQStr, MbtiQBean::class.java)

        val mbtiAStr = JsonUtils.getJson(this, "mbti/MBTIA.json")
        mbtiABean = Gson().fromJson<MbtiABean>(mbtiAStr, MbtiABean::class.java)

        tv_question.text = mbtiQBean.data[position].number+"."+mbtiQBean.data[position].question
        tv_a.text = "A:" + mbtiQBean.data[position].option.a
        tv_b.text = "B:" + mbtiQBean.data[position].option.b


        for (position in 0 until 93) {
            listAnswer.add(MbtiAItemBean((position + 1).toString(), "C"))
        }

        tv_a.clickWithTrigger {
            listAnswer[position].answer = "A"
            if (position + 1 == mbtiQBean.data.size) {
                btnStatus(false)
                gotoAnalyse()
            } else {
                ++position
                btnSelect()
                tv_question.text = mbtiQBean.data[position].number+"."+mbtiQBean.data[position].question
                tv_a.text = "A:" + mbtiQBean.data[position].option.a
                tv_b.text = "B:" + mbtiQBean.data[position].option.b
            }
        }

        tv_b.clickWithTrigger {
            listAnswer[position].answer = "B"
            if (position + 1 == mbtiQBean.data.size) {
                btnStatus(false)
                gotoAnalyse()
            } else {
                ++position
                btnSelect()
                tv_question.text = mbtiQBean.data[position].number+"."+mbtiQBean.data[position].question
                tv_a.text = "A:" + mbtiQBean.data[position].option.a
                tv_b.text = "B:" + mbtiQBean.data[position].option.b
            }

        }

        tv_prev.setOnClickListener {
            position--
            tv_question.text = mbtiQBean.data[position].number+"."+mbtiQBean.data[position].question
            tv_a.text = "A:" + mbtiQBean.data[position].option.a
            tv_b.text = "B:" + mbtiQBean.data[position].option.b
            btnSelect()
        }
    }

    private fun btnSelect() {
        if (position == 0) {
            tv_prev.visibility = View.GONE
        } else {
            tv_prev.visibility = View.VISIBLE
        }

        if (listAnswer[position].answer == "A") {
            tv_a.isSelected = true
            tv_b.isSelected = false
        } else if (listAnswer[position].answer == "B") {
            tv_b.isSelected = true
            tv_a.isSelected = false
        } else {
            tv_b.isSelected = false
            tv_a.isSelected = false
        }
    }

    private fun btnStatus(boo: Boolean) {
        tv_a.isClickable = boo
        tv_b.isClickable = boo
    }


    private fun gotoAnalyse() {
        for (position in 0 until listAnswer.size) {

            when (listAnswer[position].answer) {
                "A" -> {
                    handleAnswer(mbtiABean.data[position].option.a)
                }

                "B" -> {
                    handleAnswer(mbtiABean.data[position].option.b)
                }
            }

        }

        var mbtiResultBean =
            MbtiResultBean(scoreE, scoreI, scoreS, scoreN, scoreT, scoreF, scoreJ, scoreP)
        mbti_result = Gson().toJson(mbtiResultBean)

        var result = Intent(this, MbtiResultActivity::class.java)
        startActivity(result)
        finish()
        Log.e(
            "LLL", "scoreE:" + scoreE +
                    "scoreI:" + scoreI +
                    "scoreS:" + scoreS +
                    "scoreN:" + scoreN +
                    "scoreT:" + scoreT +
                    "scoreF:" + scoreF +
                    "scoreJ:" + scoreJ +
                    "scoreP:" + scoreP
        )

    }

    private fun handleAnswer(option: String) {

        when (option) {
            "E" -> {
                ++scoreE
            }
            "I" -> {
                ++scoreI
            }
            "S" -> {
                ++scoreS
            }
            "N" -> {
                ++scoreN
            }
            "T" -> {
                ++scoreT
            }
            "F" -> {
                ++scoreF
            }
            "J" -> {
                ++scoreJ
            }
            "P" -> {
                ++scoreP
            }
        }

    }


}

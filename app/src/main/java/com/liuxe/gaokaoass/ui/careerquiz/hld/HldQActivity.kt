package com.liuxe.gaokaoass.ui.careerquiz.hld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.*
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.utils.Preference
import com.liuxe.gaokaoass.utils.clickWithTrigger
import kotlinx.android.synthetic.main.activity_hld_q.*


class HldQActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_hld_q
    var position = 0
    var hldQBean = HldQBean()
    var hldABean = HldABean()
    var listAnswer: ArrayList<HldAItemBean> = ArrayList()


    var scoreR: Int = 0
    var scoreI: Int = 0
    var scoreA: Int = 0
    var scoreS: Int = 0
    var scoreE: Int = 0
    var scoreC: Int = 0

    var hld_result: String by Preference(Preference.HLD_CAREER_RESULT, "")

    override fun init(savedInstanceState: Bundle?) {

        initTitleBar(toolbar,"霍兰德职业兴趣测试")

        val hldQStr = JsonUtils.getJson(this, "hld/HLDQ.json")
        hldQBean = Gson().fromJson<HldQBean>(hldQStr, HldQBean::class.java)

        val hldAStr = JsonUtils.getJson(this, "hld/HLDA.json")
        hldABean = Gson().fromJson<HldABean>(hldAStr, HldABean::class.java)

        //初始化 答案数据 默认答案是2
        for (position in 0 until 60) {
            listAnswer.add(
                HldAItemBean(
                    (position+1).toString(),
                    2
                )
            )
        }

        tv_question.text = hldQBean.data[position].question

        tv_yes.clickWithTrigger {
            //是，答案设为1
            listAnswer[position].isAnswer = 1

            if (position+1 == hldQBean.data.size) {
                //当position++之后为60 说明已经做了60道题，结束
                btnStatus(false)
                gotoAnalyse()
            } else {
                ++position
                btnSelect()
                tv_question.text = hldQBean.data[position].question
            }

        }

        tv_no.clickWithTrigger {
            //否，答案设为1
            listAnswer[position].isAnswer = 0

            if (position+1 == hldQBean.data.size) {
                btnStatus(false)
                gotoAnalyse()
            } else {
                ++position
                btnSelect()
                tv_question.text = hldQBean.data[position].question
            }

        }

        tv_prev.setOnClickListener {
            position--
            tv_question.text = hldQBean.data[position].question
            btnSelect()
        }
    }


    private fun btnSelect() {
        if (position == 0) {
            tv_prev.visibility = View.GONE
        } else {
            tv_prev.visibility = View.VISIBLE
        }

        if (listAnswer[position].isAnswer == 1) {
            tv_yes.isSelected = true
            tv_no.isSelected = false
        } else if (listAnswer[position].isAnswer == 0) {
            tv_no.isSelected = true
            tv_yes.isSelected = false
        } else {
            tv_no.isSelected = false
            tv_yes.isSelected = false
        }
    }


    private fun btnStatus(boo: Boolean) {
        tv_yes.isClickable = boo
        tv_no.isClickable = boo
    }


    private fun gotoAnalyse() {

        val tempHldABean = hldABean

        for (aIndex in listAnswer.indices) {
            for (xIndex in tempHldABean.data.indices) {
                for (yIndex in tempHldABean.data[xIndex].item.indices) {
                    if (listAnswer[aIndex].question.equals(tempHldABean.data[xIndex].item[yIndex].question)) {

                        //tempHldABean.data[xIndex].item.removeAt(yIndex)
                        if (listAnswer[aIndex].isAnswer == tempHldABean.data[xIndex].item[yIndex].isAnswer) {
                            if (tempHldABean.data[xIndex].typeCode.equals("R")) {
                                ++scoreR
                            } else if (hldABean.data[xIndex].typeCode.equals("I")) {
                                ++scoreI
                            } else if (hldABean.data[xIndex].typeCode.equals("A")) {
                                ++scoreA
                            } else if (hldABean.data[xIndex].typeCode.equals("S")) {
                                ++scoreS
                            } else if (hldABean.data[xIndex].typeCode.equals("E")) {
                                ++scoreE
                            } else if (hldABean.data[xIndex].typeCode.equals("C")) {
                                ++scoreC
                            }
                        }
                    }
                }
            }
        }


        val resultItemList: ArrayList<HldResultItemBean> = ArrayList()
        resultItemList.add(
            HldResultItemBean(0, "R", scoreR)
        )
        resultItemList.add(
            HldResultItemBean(1, "I", scoreI)
        )
        resultItemList.add(
            HldResultItemBean(2, "A", scoreA)
        )
        resultItemList.add(
            HldResultItemBean(3, "S", scoreS)
        )
        resultItemList.add(
            HldResultItemBean(4, "E", scoreE)
        )
        resultItemList.add(
            HldResultItemBean(5, "C", scoreC)
        )


        val hldResultBean =
            HldResultBean("", resultItemList)
        hld_result = Gson().toJson(hldResultBean)
        Log.e("LLL question",hld_result)
        val result = Intent(this, HldResultActivity::class.java)
        startActivity(result)
        finish()

        Log.e(
            "LLL", "scoreR:" + scoreR +
                    "scoreI:" + scoreI +
                    "scoreA:" + scoreA +
                    "scoreS:" + scoreS +
                    "scoreE:" + scoreE +
                    "scoreC:" + scoreC
        )


    }


}

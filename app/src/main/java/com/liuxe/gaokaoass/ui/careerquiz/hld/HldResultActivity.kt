package com.liuxe.gaokaoass.ui.careerquiz.hld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.gson.Gson
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.HldResultBean
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.HldResultItemBean
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.HldResultMsgBean
import com.liuxe.gaokaoass.ui.careerquiz.major.MajorActivity
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.utils.Preference
import kotlinx.android.synthetic.main.activity_hld_result.*
import java.util.Collections.swap


class HldResultActivity : BaseVMActivity() {
    override fun getLayout() = com.liuxe.gaokaoass.R.layout.activity_hld_result

    var resultItemList: ArrayList<HldResultItemBean> = ArrayList()
    var hldResultMsg = HldResultMsgBean()
    var hldResultBean: HldResultBean? = null
    var hld_result: String by Preference(Preference.HLD_CAREER_RESULT, "")

    @SuppressLint("SetJavaScriptEnabled")
    override fun init(savedInstanceState: Bundle?) {

        initTitleBar(toolbar, "霍兰德职业兴趣测试")
//        hld_result = intent.getStringExtra("hld")
        //拿到本地存储的霍兰德数据
        hldResultBean = Gson().fromJson(hld_result, HldResultBean::class.java)
        Log.e("LLL result",hld_result)
        resultItemList = hldResultBean?.data as ArrayList<HldResultItemBean>
        //拿到霍兰德结论
        val hldResultMsgStr = JsonUtils.getJson(this, "hld/RIASEC.json")
        hldResultMsg = Gson().fromJson(hldResultMsgStr, HldResultMsgBean::class.java)
        //对霍兰德数据进行排序
        val resultItemSortList: ArrayList<HldResultItemBean> = sortScore(resultItemList)

        //头部显示
        tv_result_one.text = resultItemSortList[0].code
        tv_result_two.text = resultItemSortList[1].code
        tv_result_three.text = resultItemSortList[2].code
        tv_result_mian.text = "主导兴趣：" + hldResultMsg.data[resultItemSortList[0].position].character
        tv_result_main_text.text = hldResultMsg.data[resultItemSortList[0].position].jieshao

        //第一个兴趣
        tv_result_one_title.text = hldResultMsg.data[resultItemSortList[0].position].type_name.replace("：","")
        tv_result_one_gttz.text = hldResultMsg.data[resultItemSortList[0].position].tezheng
        tv_result_one_dxzy.text = hldResultMsg.data[resultItemSortList[0].position].zhiye
        //第一个兴趣
        tv_result_two_title.text = hldResultMsg.data[resultItemSortList[1].position].type_name.replace("：","")
        tv_result_two_gttz.text = hldResultMsg.data[resultItemSortList[1].position].tezheng
        tv_result_two_dxzy.text = hldResultMsg.data[resultItemSortList[1].position].zhiye
        //第一个兴趣
        tv_result_three_title.text = hldResultMsg.data[resultItemSortList[2].position].type_name.replace("：","")
        tv_result_three_gttz.text = hldResultMsg.data[resultItemSortList[2].position].tezheng
        tv_result_three_dxzy.text = hldResultMsg.data[resultItemSortList[2].position].zhiye


        //展示六边形图片
//        val jsonStr = Gson().toJson(hldResultBean)

        web_echarts.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                Log.e("LLL", "====onPageFinished====")
                Log.e("LLL loadweb", hld_result)
                //web网页加载完成 调用js 传入数据json
                web_echarts.refreshEchartsWithOption(hld_result)
            }
        }

        //重做 清空本地数据，关闭
        tv_again.setOnClickListener {
            hld_result = ""
            finish()
        }

        //查看专业
        tv_zy.setOnClickListener {
            val major = Intent(
                this,
                MajorActivity::class.java
            )
            major.putExtra("type", resultItemSortList[0].code)
            startActivity(major)
        }

    }


    //冒泡排序算法
    private fun sortScore(numbers: ArrayList<HldResultItemBean>): ArrayList<HldResultItemBean> {

        if (numbers.size == 0) return numbers
        val maxIndex = numbers.size - 1
        var haveSwap = false        // 标识算法执行过程中是否发生过交换操作
        for (n in 0 until maxIndex) {
            for (i in 0 until maxIndex - n) {
                if (numbers[i].score < numbers[i + 1].score) {
                    swap(numbers, i, i + 1)
                    haveSwap = true
                }
            }
            if (!haveSwap) return numbers  // 快速结束
        }
        return numbers
    }

    override fun onDestroy() {
        //页面关闭时，将webview释放，清空。
        if (web_echarts != null) {
            //加载null内容
            web_echarts.loadDataWithBaseURL(null, "", "text/html", "utf-8", null)
            //清除历史记录
            web_echarts.clearHistory()
            //移除WebView
            (web_echarts.getParent() as ViewGroup).removeView(web_echarts)
            //销毁VebView
            web_echarts.destroy()
        }
        super.onDestroy()
    }
}

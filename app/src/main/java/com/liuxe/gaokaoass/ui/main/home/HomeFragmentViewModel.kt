package com.liuxe.gaokaoass.ui.main.home

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseStatusViewModel
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class HomeFragmentViewModel:BaseStatusViewModel() {
    var mCountDownTime = MutableLiveData<String>()

    fun getCountDownTime(){
        val sdf: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
        val startTime = sdf.format(Date())


        val otherDays = dateDiff(startTime, "2020-07-07", "yyyy-MM-dd")

        mCountDownTime.value = otherDays.toString()
    }

    fun dateDiff(startTime: String, endTime: String, format: String): Long {
        // 按照传入的格式生成一个simpledateformate对象
        val sd = SimpleDateFormat(format)
        val nd = (1000 * 24 * 60 * 60).toLong()// 一天的毫秒数
        val nh = (1000 * 60 * 60).toLong()// 一小时的毫秒数
        val nm = (1000 * 60).toLong()// 一分钟的毫秒数
        val ns: Long = 1000// 一秒钟的毫秒数
        val diff: Long
        var day: Long = 0
        try {
            // 获得两个时间的毫秒时间差异
            diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime()
            day = diff / nd// 计算差多少天
            val hour = diff % nd / nh// 计算差多少小时
            val min = diff % nd % nh / nm// 计算差多少分钟
            val sec = diff % nd % nh % nm / ns// 计算差多少秒
            // 输出结果
            if (day >= 1) {
                return day
            } else {
                return if (day == 0L) {
                    1
                } else {
                    0
                }

            }

        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return 0

    }
}
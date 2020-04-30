package com.liuxe.gaokaoass.ui.careerquiz

import android.util.Log
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.MajorBean

class MajorAdapter(data:List<MajorBean.DataBean>) :BaseQuickAdapter<MajorBean.DataBean,BaseViewHolder>(R.layout.item_major,data) {
    override fun convert(helper: BaseViewHolder?, item: MajorBean.DataBean?) {

        helper?.setText(R.id.tv_major_name,item?.zhuanyemingcheng)
        var zy = ""
        for (index in item?.jobs!!.indices){
            if (index == item.jobs.size+1){
                zy+item.jobs[index]
            } else{
                zy+item.jobs[index]+"/"
            }

        }
        Log.e("LLL",zy)
        helper?.setText(R.id.tv_major_pro,zy)
        helper?.setText(R.id.tv_major_money,"￥"+item?.xinzi)
    }


}
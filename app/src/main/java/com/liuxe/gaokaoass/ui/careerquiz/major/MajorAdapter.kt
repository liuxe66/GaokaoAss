package com.liuxe.gaokaoass.ui.careerquiz.major

import android.util.Log
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.ui.careerquiz.hld.bean.MajorBean

class MajorAdapter(data:MutableList<MajorBean.DataBean>) :BaseQuickAdapter<MajorBean.DataBean, BaseViewHolder>(R.layout.item_major,data) {


    override fun convert(holder: BaseViewHolder, item: MajorBean.DataBean) {

        holder.setText(R.id.tv_major_name,item.zhuanyemingcheng)
        val zy = ""
        for (index in item.jobs!!.indices){
            if (index == item.jobs.size+1){
                zy+item.jobs[index]
            } else{
                zy+item.jobs[index]+"/"
            }

        }
        Log.e("LLL",zy)
        holder.setText(R.id.tv_major_pro,zy)
        holder.setText(R.id.tv_major_money,"￥"+ item.xinzi)
    }


}
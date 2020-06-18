package com.liuxe.gaokaoass.ui.guide.adapter

import androidx.lifecycle.LiveData
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.GuidePolicyBean

class GuidePolicyItemAdapter(data: MutableList<GuidePolicyBean.SectionBean>) :
    BaseQuickAdapter<GuidePolicyBean.SectionBean, BaseViewHolder>(R.layout.item_guide_policy_child,data) {
    override fun convert(holder: BaseViewHolder, item: GuidePolicyBean.SectionBean) {
        if (item.title.isEmpty()){
            holder.setGone(R.id.tv_title,true)
        } else {
            holder.setGone(R.id.tv_title,false)
        }
        holder.setText(R.id.tv_title,item.title)

        holder.setText(R.id.tv_content,formatString(item.content))
    }

    fun formatString(string: String):String{
        return string.replace("[p]","")
    }
}
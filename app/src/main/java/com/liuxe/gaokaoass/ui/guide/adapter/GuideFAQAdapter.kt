package com.liuxe.gaokaoass.ui.guide.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.GuideBean

class GuideFAQAdapter(data: MutableList<GuideBean>) :
    BaseQuickAdapter<GuideBean, BaseViewHolder>(R.layout.item_guide_faq, data) {
    override fun convert(holder: BaseViewHolder, item: GuideBean) {
        holder.setText(R.id.tv_title,item.title)
        holder.setText(R.id.tv_content,formatString(item.content))
    }

    fun formatString(string: String):String{
        return string.replace("[p]","")
    }
}
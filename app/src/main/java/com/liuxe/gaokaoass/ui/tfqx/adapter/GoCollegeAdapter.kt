package com.liuxe.gaokaoass.ui.tfqx.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ExamineeBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils

class GoCollegeAdapter(
    data: MutableList<ExamineeBean.ExamineeGoBean.GoCollegesBean>?
) : BaseQuickAdapter<ExamineeBean.ExamineeGoBean.GoCollegesBean, BaseViewHolder>(
    R.layout.item_go_college,
    data
) {
    override fun convert(holder: BaseViewHolder, item: ExamineeBean.ExamineeGoBean.GoCollegesBean) {
        GlideUtils.loadImage(context,"http:"+ item.icon, holder.getView(R.id.iv_cover))
        holder.setText(R.id.tv_college_name,item.name)
        holder.setText(R.id.tv_proba,(item.percent*100).toInt().toString()+"%")
    }
}
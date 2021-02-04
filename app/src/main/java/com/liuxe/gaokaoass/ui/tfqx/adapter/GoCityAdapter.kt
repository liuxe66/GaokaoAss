package com.liuxe.gaokaoass.ui.tfqx.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ExamineeBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils

class GoCityAdapter(
    data: MutableList<ExamineeBean.ExamineeGoBean.GoCityBean>?
) : BaseQuickAdapter<ExamineeBean.ExamineeGoBean.GoCityBean, BaseViewHolder>(
    R.layout.item_go_major,
    data
) {
    override fun convert(holder: BaseViewHolder, item: ExamineeBean.ExamineeGoBean.GoCityBean) {
        holder.setText(R.id.tv_name,item.name)
        holder.setText(R.id.tv_proba,(item.percent*100).toInt().toString()+"%")
    }
}
package com.liuxe.gaokaoass.ui.zntb.major

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.QueryMajorBean

class ZntbQueryMajorAdapter(data: MutableList<QueryMajorBean.MajorListBean>?) :
    BaseQuickAdapter<QueryMajorBean.MajorListBean, BaseViewHolder>(R.layout.item_query_major, data) {
    override fun convert(holder: BaseViewHolder, item: QueryMajorBean.MajorListBean) {
        holder.setText(R.id.tv_major,item.name)
        holder.setText(R.id.tv_tag,item.batch)
    }
}
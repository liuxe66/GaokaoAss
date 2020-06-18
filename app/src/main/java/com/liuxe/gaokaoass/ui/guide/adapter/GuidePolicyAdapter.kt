package com.liuxe.gaokaoass.ui.guide.adapter

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.GuidePolicyBean

class GuidePolicyAdapter(data: MutableList<List<GuidePolicyBean.SectionBean>>) :
    BaseQuickAdapter<List<GuidePolicyBean.SectionBean>, BaseViewHolder>(
        R.layout.item_guide_policy,
        data
    ) {
    override fun convert(holder: BaseViewHolder, item: List<GuidePolicyBean.SectionBean>) {
        when(holder.adapterPosition){
            0 ->  holder.setText(R.id.tv_title_policy,"1.熟悉报考设置和政策")
            1 ->  holder.setText(R.id.tv_title_policy,"2.确定考生录取批次")
            2 ->  holder.setText(R.id.tv_title_policy,"3.筛选报考大学")
            3 ->  holder.setText(R.id.tv_title_policy,"4.了解录取和投档规则")
            4 ->  holder.setText(R.id.tv_title_policy,"5.其他注意事项")
        }

        val recycler= holder.getView<RecyclerView>(R.id.recycler_guide_policy)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = GuidePolicyItemAdapter(item as MutableList<GuidePolicyBean.SectionBean>)
    }
}
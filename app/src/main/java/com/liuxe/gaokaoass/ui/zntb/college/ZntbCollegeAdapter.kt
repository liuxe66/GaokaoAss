package com.liuxe.gaokaoass.ui.zntb.college

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils
import java.text.NumberFormat

class ZntbCollegeAdapter(data:MutableList<ZntbCollegesBean.CollegesBean>)
    :BaseQuickAdapter<ZntbCollegesBean.CollegesBean,BaseViewHolder>(R.layout.item_zntb_college,data) {
    override fun convert(holder: BaseViewHolder, item: ZntbCollegesBean.CollegesBean) {

        holder.setText(R.id.tv_zntb_college_name, item.name)
        holder.setText(R.id.tv_zntb_college_pici,"录取批次："+ item.batch)
        GlideUtils.loadImage(context,"http:"+ item.icon, holder.getView(R.id.iv_zntb_college)!!)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        var tags:List<String> = ArrayList()
        if (item.tags != null){
            if (item.tags.size != 0){
                tags = item.tags!!
            }
        }

        val tagAdapter =
            ZntbCollegeTagAdapter(tags as MutableList<String>)
        holder.getView<RecyclerView>(R.id.recycler_tag)?.layoutManager = layoutManager
        holder.getView<RecyclerView>(R.id.recycler_tag)?.adapter = tagAdapter

        val numberFormat = NumberFormat.getNumberInstance()
        numberFormat.maximumFractionDigits = 1
        val proba = numberFormat.format(item.probability.times(100))
        holder.setText(R.id.tv_zntb_college_proba,"录取概率："+proba+"%")

        holder.setText(R.id.tv_zntb_college_score,item.year.toString()+"最低分:\u3000"+item.lowest_score.toString())
        holder.setText(R.id.tv_zntb_college_weici,item.year.toString()+"最低位次:"+item.lowest_rank.toString())
    }
}
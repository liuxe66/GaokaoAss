package com.liuxe.gaokaoass.ui.zntb

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils
import java.text.NumberFormat

class ZntbCollegeAdapter(data:List<ZntbCollegesBean.CollegesBean>)
    :BaseQuickAdapter<ZntbCollegesBean.CollegesBean,BaseViewHolder>(R.layout.item_zntb_college,data) {
    override fun convert(helper: BaseViewHolder?, item: ZntbCollegesBean.CollegesBean?) {

        helper?.setText(R.id.tv_zntb_college_name,item?.name)
        helper?.setText(R.id.tv_zntb_college_pici,"录取批次："+item?.batch)
        GlideUtils.loadImage(mContext,"http:"+item?.icon,helper?.getView(R.id.iv_zntb_college)!!)

        val layoutManager = LinearLayoutManager(mContext)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        var tags:List<String> = ArrayList()
        if (item?.tags != null){
            if (item?.tags?.size != 0){
                tags = item?.tags!!
            }
        }

        val tagAdapter = ZntbCollegeTagAdapter(tags)
        helper?.getView<RecyclerView>(R.id.recycler_tag)?.layoutManager = layoutManager
        helper?.getView<RecyclerView>(R.id.recycler_tag)?.adapter = tagAdapter

        val numberFormat = NumberFormat.getNumberInstance()
        numberFormat.maximumFractionDigits = 1
        val proba = numberFormat.format(item?.probability?.times(100))
        helper?.setText(R.id.tv_zntb_college_proba,"录取概率："+proba+"%")

    }
}
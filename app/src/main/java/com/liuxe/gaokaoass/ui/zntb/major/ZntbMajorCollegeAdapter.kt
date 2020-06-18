package com.liuxe.gaokaoass.ui.zntb.major

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ZntbMajorCollegeBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils
import java.text.NumberFormat

class ZntbMajorCollegeAdapter(
    data: MutableList<ZntbMajorCollegeBean.CollegesBean>?
) : BaseQuickAdapter<ZntbMajorCollegeBean.CollegesBean, BaseViewHolder>(R.layout.item_major_college, data) {
    override fun convert(holder: BaseViewHolder, item: ZntbMajorCollegeBean.CollegesBean) {
        holder.setText(R.id.tv_zntb_college_name, item.name)
        holder.setText(R.id.tv_zntb_college_pici,"录取批次："+ item.batch)
        GlideUtils.loadImage(context,"http:"+ item.icon, holder.getView(R.id.iv_zntb_college)!!)
        val numberFormat = NumberFormat.getNumberInstance()
        numberFormat.maximumFractionDigits = 1
        val probaCollege = numberFormat.format(item.probability.times(100))
        holder.setText(R.id.tv_zntb_college_proba,"录取概率："+probaCollege+"%")

        holder.setText(R.id.tv_zntb_college_score,item.year.toString()+"最低分:\u3000"+item.lowest_score.toString())
        holder.setText(R.id.tv_zntb_college_weici,item.year.toString()+"最低位次:"+item.lowest_rank.toString())


        //专业
        holder.setText(R.id.tv_major_name, item.majors[0].name)
        holder.setText(R.id.tv_major_pici,"录取批次："+ item.majors[0].batch)

        val probaMajor = numberFormat.format(item.majors[0].probability.times(100))
        holder.setText(R.id.tv_major_proba,"录取概率："+probaMajor+"%")

        holder.setText(R.id.tv_major_score,item.year.toString()+"最低分:\u3000"+item.majors[0].lowest_score.toString())
        holder.setText(R.id.tv_major_weici,item.year.toString()+"最低位次:"+item.majors[0].lowest_rank.toString())
    }
}
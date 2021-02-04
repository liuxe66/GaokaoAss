package com.liuxe.gaokaoass.ui.scorepart

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ScorePartBean

class ScorePartAdapter( data: MutableList<ScorePartBean.ScoresAndRanksBean>?) :
    BaseQuickAdapter<ScorePartBean.ScoresAndRanksBean, BaseViewHolder>(R.layout.item_score_part, data) {
    override fun convert(holder: BaseViewHolder, item: ScorePartBean.ScoresAndRanksBean) {
        holder.setText(R.id.tv_score,item.score)
        holder.setText(R.id.tv_num,item.numbers)
        holder.setText(R.id.tv_sum,item.sums)
    }
}
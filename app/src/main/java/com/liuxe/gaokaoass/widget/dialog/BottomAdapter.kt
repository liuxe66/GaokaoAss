package com.liuxe.gaokaoass.widget.dialog

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

import com.liuxe.gaokaoass.R

class BottomAdapter(data: MutableList<String>,var location:String) : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_bottom_dialog,data) {

    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.tv_item,item)
        holder.getView<TextView>(R.id.tv_item).isSelected = location == item
    }
}
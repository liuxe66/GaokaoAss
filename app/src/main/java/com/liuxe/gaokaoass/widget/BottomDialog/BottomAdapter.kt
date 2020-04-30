package com.liuxe.gaokaoass.widget.BottomDialog

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.liuxe.gaokaoass.R

class BottomAdapter(var data: ArrayList<String>?,var location:String) : BaseQuickAdapter<String, BaseViewHolder>(data) {
    init {
        mLayoutResId = R.layout.item_bottom_dialog
    }
    override fun convert(helper: BaseViewHolder?, item: String?) {
        helper?.setText(R.id.tv_item,item)
        if (location == item){
            helper?.getView<TextView>(R.id.tv_item)?.isSelected = true
        } else {
            helper?.getView<TextView>(R.id.tv_item)?.isSelected = false
        }

    }
}
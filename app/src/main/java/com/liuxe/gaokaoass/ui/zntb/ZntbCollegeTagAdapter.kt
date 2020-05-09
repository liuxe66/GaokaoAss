package com.liuxe.gaokaoass.ui.zntb

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils
import java.text.NumberFormat

class ZntbCollegeTagAdapter(data:List<String>)
    :BaseQuickAdapter<String,BaseViewHolder>(R.layout.item_zntb_college_tag,data) {
    override fun convert(helper: BaseViewHolder?, item: String?) {
        helper?.setText(R.id.tv_zntb_college_tag,item)
    }

}
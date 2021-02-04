package com.liuxe.gaokaoass.ui.video

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.bean.VideoBean
import com.liuxe.gaokaoass.utils.glide.GlideUtils

class VideoListAdapter( data: MutableList<VideoBean.DataBean>?) :
    BaseQuickAdapter<VideoBean.DataBean, BaseViewHolder>(R.layout.item_video, data) {
    override fun convert(holder: BaseViewHolder, item: VideoBean.DataBean) {
        holder.setText(R.id.tv_title,(holder.adapterPosition+1).toString()+"."+item.title)
        GlideUtils.loadImage(context,item.coverimg,holder.getView(R.id.iv_cover))
    }
}
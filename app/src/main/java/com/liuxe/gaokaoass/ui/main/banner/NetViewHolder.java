package com.liuxe.gaokaoass.ui.main.banner;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.liuxe.gaokaoass.R;
import com.zhpan.bannerview.BaseViewHolder;

/*
 *Created by  on
 *desc :
 */public class NetViewHolder extends BaseViewHolder<BannerData> {

    public NetViewHolder(@NonNull View itemView) {
        super(itemView);
        ImageView imageView = findView(R.id.banner_image);

    }

    @Override
    public void bindData(BannerData data, int position, int pageSize) {
        ImageView imageView = findView(R.id.banner_image);
        Glide.with(imageView).load(data.getImgpath()).into(imageView);
    }
}
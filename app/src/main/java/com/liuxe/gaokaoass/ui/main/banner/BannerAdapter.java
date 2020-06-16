package com.liuxe.gaokaoass.ui.main.banner;

import android.view.View;

import com.liuxe.gaokaoass.R;
import com.zhpan.bannerview.BaseBannerAdapter;

/*
 *Created by  on
 *desc :
 */public class BannerAdapter extends BaseBannerAdapter<BannerData, NetViewHolder> {
    @Override
    protected void onBind(NetViewHolder holder, BannerData data, int position, int pageSize) {
        holder.bindData(data, position, pageSize);
    }

    @Override
    public NetViewHolder createViewHolder(View itemView, int viewType) {
        return new NetViewHolder(itemView);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.item_banner;
    }
}

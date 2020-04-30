package com.liuxe.gaokaoass.ui.careerquiz.mbti;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.liuxe.gaokaoass.R;
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultMsgBean;
import com.liuxe.gaokaoass.widget.MyListView;

import java.util.List;

public class MbtiResultInfotAdapter extends BaseAdapter {
    private List<MbtiResultMsgBean.DataBean.InfoBean.InfosBean> mList;

    public MbtiResultInfotAdapter(List<MbtiResultMsgBean.DataBean.InfoBean.InfosBean> mList) {
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHoder viewHoder;
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mbti_result_info,null);
            viewHoder = new ViewHoder();
            viewHoder.tvInfoTitle = view.findViewById(R.id.tv_info_title);
            viewHoder.lvInfo = view.findViewById(R.id.lv_info);
            view.setTag(viewHoder);
        } else {
            viewHoder = (ViewHoder) view.getTag();
        }
        viewHoder.tvInfoTitle.setText(mList.get(position).getTitle());

        MbtiResultInfoDescAdapter mAdapter = new MbtiResultInfoDescAdapter(mList.get(position).getDescs());
        viewHoder.lvInfo.setAdapter(mAdapter);

        return view;
    }

    static class ViewHoder{
        TextView tvInfoTitle;
        MyListView lvInfo;
    }

}

package com.liuxe.gaokaoass.ui.careerquiz.mbti;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.liuxe.gaokaoass.R;
import com.liuxe.gaokaoass.ui.careerquiz.mbti.bean.MbtiResultMsgBean;

import java.util.List;

public class MbtiResultInfoDescAdapter extends BaseAdapter {
    private List<MbtiResultMsgBean.DataBean.InfoBean.InfosBean.DescsBean> mList;

    public MbtiResultInfoDescAdapter(List<MbtiResultMsgBean.DataBean.InfoBean.InfosBean.DescsBean> mList) {
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
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mbti_result_info_desc,null);
            viewHoder = new ViewHoder();
            viewHoder.tvTitle = view.findViewById(R.id.tv_info_desc_title);
            viewHoder.tvInfo = view.findViewById(R.id.tv_info_desc_txt);
            view.setTag(viewHoder);
        } else {
            viewHoder = (ViewHoder) view.getTag();
        }
        viewHoder.tvTitle.setText(mList.get(position).getTitle());
        String txt = mList.get(position).getContent();
        txt.replaceAll(" ","");
        Log.e("LLL",txt);
        viewHoder.tvInfo.setText(txt);

        return view;
    }

    static class ViewHoder{
        TextView tvTitle;
        TextView tvInfo;
    }

}

package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HldResultBean implements Serializable {
    private String resultCode;
    private List<HldResultItemBean> data;

    public HldResultBean(String resultCode, List<HldResultItemBean> data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode == null ? "" : resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public List<HldResultItemBean> getData() {
        if (data == null) {
            return new ArrayList<>();
        }
        return data;
    }

    public void setData(List<HldResultItemBean> data) {
        this.data = data;
    }
}

package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

import java.io.Serializable;

/*
 *Created by Liuxe on
 *desc :
 */
public class HldResultItemBean implements Serializable {
    private int position;
    private String code;
    private int score;

    public HldResultItemBean(int position,String code, int score) {
        this.position = position;
        this.code = code;
        this.score = score;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

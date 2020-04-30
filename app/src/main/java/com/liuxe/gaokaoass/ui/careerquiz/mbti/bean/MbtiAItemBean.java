package com.liuxe.gaokaoass.ui.careerquiz.mbti.bean;

public class MbtiAItemBean {
    private String number;
    private String answer; //默认c，真实答案a，b

    public MbtiAItemBean(String number, String answer) {
        this.number = number;
        this.answer = answer;
    }

    public String getNumber() {
        return number == null ? "" : number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAnswer() {
        return answer == null ? "" : answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

/*
 *Created by Liuxe on
 *desc :
 */
public class HldAItemBean {
    public HldAItemBean(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    /**
     * question : 2
     * answer : 1 true,0 false,2 还没选择
     */

    private String question;
    private int answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int isAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}

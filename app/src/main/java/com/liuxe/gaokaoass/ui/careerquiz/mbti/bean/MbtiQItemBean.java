package com.liuxe.gaokaoass.ui.careerquiz.mbti.bean;

public class MbtiQItemBean {
    /**
     * number : 1
     * question : 当你要外出一整天,你会____?
     * option : {"A":"计划你要做什么和在什么时候做","B":"说去就去"}
     */

    private String number;
    private String question;
    private OptionBean option;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public OptionBean getOption() {
        return option;
    }

    public void setOption(OptionBean option) {
        this.option = option;
    }
    

    public static class OptionBean {
        /**
         * A : 计划你要做什么和在什么时候做
         * B : 说去就去
         */

        private String A;
        private String B;

        public String getA() {
            return A;
        }

        public void setA(String A) {
            this.A = A;
        }

        public String getB() {
            return B;
        }

        public void setB(String B) {
            this.B = B;
        }
    }
}

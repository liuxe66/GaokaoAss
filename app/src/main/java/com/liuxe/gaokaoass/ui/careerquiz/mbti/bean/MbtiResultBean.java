package com.liuxe.gaokaoass.ui.careerquiz.mbti.bean;

public class MbtiResultBean {
    private int scoreE;
    private int scoreI;
    private int scoreS;
    private int scoreN;
    private int scoreT;
    private int scoreF;
    private int scoreJ;
    private int scoreP;

    public MbtiResultBean() {
    }

    public MbtiResultBean(int scoreE, int scoreI, int scoreS, int scoreN, int scoreT, int scoreF, int scoreJ, int scoreP) {
        this.scoreE = scoreE;
        this.scoreI = scoreI;
        this.scoreS = scoreS;
        this.scoreN = scoreN;
        this.scoreT = scoreT;
        this.scoreF = scoreF;
        this.scoreJ = scoreJ;
        this.scoreP = scoreP;
    }

    public int getScoreE() {
        return scoreE;
    }

    public void setScoreE(int scoreE) {
        this.scoreE = scoreE;
    }

    public int getScoreI() {
        return scoreI;
    }

    public void setScoreI(int scoreI) {
        this.scoreI = scoreI;
    }

    public int getScoreS() {
        return scoreS;
    }

    public void setScoreS(int scoreS) {
        this.scoreS = scoreS;
    }

    public int getScoreN() {
        return scoreN;
    }

    public void setScoreN(int scoreN) {
        this.scoreN = scoreN;
    }

    public int getScoreT() {
        return scoreT;
    }

    public void setScoreT(int scoreT) {
        this.scoreT = scoreT;
    }

    public int getScoreF() {
        return scoreF;
    }

    public void setScoreF(int scoreF) {
        this.scoreF = scoreF;
    }

    public int getScoreJ() {
        return scoreJ;
    }

    public void setScoreJ(int scoreJ) {
        this.scoreJ = scoreJ;
    }

    public int getScoreP() {
        return scoreP;
    }

    public void setScoreP(int scoreP) {
        this.scoreP = scoreP;
    }
}

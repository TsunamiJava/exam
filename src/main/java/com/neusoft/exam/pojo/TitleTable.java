package com.neusoft.exam.pojo;

public class TitleTable {
    private Integer titleId;

    private String titleText;

    private Integer titleLevel;

    private String titleMajor;

    private Integer titleBackgroud;

    private String titleOptionA;

    private String titleOptionB;

    private String titleOptionC;

    private String titleOptionD;

    private String titleExplain;

    private Integer titleType;

    private Integer titleStatus;

    private String titleAnswer;

    private String titleTime;

    private Integer titleNum;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText == null ? null : titleText.trim();
    }

    public Integer getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(Integer titleLevel) {
        this.titleLevel = titleLevel;
    }

    public String getTitleMajor() {
        return titleMajor;
    }

    public void setTitleMajor(String titleMajor) {
        this.titleMajor = titleMajor == null ? null : titleMajor.trim();
    }

    public Integer getTitleBackgroud() {
        return titleBackgroud;
    }

    public void setTitleBackgroud(Integer titleBackgroud) {
        this.titleBackgroud = titleBackgroud;
    }

    public String getTitleOptionA() {
        return titleOptionA;
    }

    public void setTitleOptionA(String titleOptionA) {
        this.titleOptionA = titleOptionA == null ? null : titleOptionA.trim();
    }

    public String getTitleOptionB() {
        return titleOptionB;
    }

    public void setTitleOptionB(String titleOptionB) {
        this.titleOptionB = titleOptionB == null ? null : titleOptionB.trim();
    }

    public String getTitleOptionC() {
        return titleOptionC;
    }

    public void setTitleOptionC(String titleOptionC) {
        this.titleOptionC = titleOptionC == null ? null : titleOptionC.trim();
    }

    public String getTitleOptionD() {
        return titleOptionD;
    }

    public void setTitleOptionD(String titleOptionD) {
        this.titleOptionD = titleOptionD == null ? null : titleOptionD.trim();
    }

    public String getTitleExplain() {
        return titleExplain;
    }

    public void setTitleExplain(String titleExplain) {
        this.titleExplain = titleExplain == null ? null : titleExplain.trim();
    }

    public Integer getTitleType() {
        return titleType;
    }

    public void setTitleType(Integer titleType) {
        this.titleType = titleType;
    }

    public Integer getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(Integer titleStatus) {
        this.titleStatus = titleStatus;
    }

    public String getTitleAnswer() {
        return titleAnswer;
    }

    public void setTitleAnswer(String titleAnswer) {
        this.titleAnswer = titleAnswer == null ? null : titleAnswer.trim();
    }

    public String getTitleTime() {
        return titleTime;
    }

    public void setTitleTime(String titleTime) {
        this.titleTime = titleTime == null ? null : titleTime.trim();
    }

    public Integer getTitleNum() {
        return titleNum;
    }

    public void setTitleNum(Integer titleNum) {
        this.titleNum = titleNum;
    }
}
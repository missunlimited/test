package com.test.test.persistence.entity;

public class QuestionAnswer {
    private Integer qaId;
    private String question;
    private String correctAnswer;
    private String dummyAnswer1;
    private String dummyAnswer2;
    private String dummyAnswer3;
    private Boolean correctFlag;

    public Integer getQaId() {
        return qaId;
    }

    public void setQaId(Integer qaId) {
        this.qaId = qaId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getDummyAnswer1() {
        return dummyAnswer1;
    }

    public void setDummyAnswer1(String dummyAnswer1) {
        this.dummyAnswer1 = dummyAnswer1;
    }

    public String getDummyAnswer2() {
        return dummyAnswer2;
    }

    public void setDummyAnswer2(String dummyAnswer2) {
        this.dummyAnswer2 = dummyAnswer2;
    }

    public String getDummyAnswer3() {
        return dummyAnswer3;
    }

    public void setDummyAnswer3(String dummyAnswer3) {
        this.dummyAnswer3 = dummyAnswer3;
    }

    public Boolean getCorrectFlag() {
        return correctFlag;
    }

    public void setCorrectFlag(Boolean correctFlag) {
        this.correctFlag = correctFlag;
    }
}

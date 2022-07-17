package com.lastExam.lastExam.web.response;

public class QuestionAnswerResponse {
    private Integer qaId;
    private String question;
    private String correctAnswer;
    private String dummyAnswer1;
    private String dummyAnswer2;
    private String dummyAnswer3;
    private Boolean correctFlag;

    public QuestionAnswerResponse(Integer qaId, String question, String correctAnswer, String dummyAnswer1, String dummyAnswer2, String dummyAnswer3, Boolean correctFlag) {
        this.qaId = qaId;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.dummyAnswer1 = dummyAnswer1;
        this.dummyAnswer2 = dummyAnswer2;
        this.dummyAnswer3 = dummyAnswer3;
        this.correctFlag = correctFlag;
    }

    public Integer getQaId() {
        return qaId;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getDummyAnswer1() {
        return dummyAnswer1;
    }

    public String getDummyAnswer2() {
        return dummyAnswer2;
    }

    public String getDummyAnswer3() {
        return dummyAnswer3;
    }

    public Boolean getCorrectFlag() {
        return correctFlag;
    }
}

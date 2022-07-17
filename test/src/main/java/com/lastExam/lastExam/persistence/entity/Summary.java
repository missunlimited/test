package com.lastExam.lastExam.persistence.entity;

public class Summary {
    private Integer summaryId;
    private Integer correct;
    private Integer setQuestionId;

    public Integer getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(Integer summaryId) {
        this.summaryId = summaryId;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Integer getSetQuestionId() {
        return setQuestionId;
    }

    public void setSetQuestionId(Integer setQuestionId) {
        this.setQuestionId = setQuestionId;
    }
}

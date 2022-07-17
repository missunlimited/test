package com.lastExam.lastExam.service;

import com.lastExam.lastExam.persistence.entity.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerService {
    List<QuestionAnswer> findAll();

    QuestionAnswer findById(Integer qaId);
}

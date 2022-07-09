package com.test.test.service;

import com.test.test.persistence.entity.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerService {
    List<QuestionAnswer> findAll();

    QuestionAnswer findById(Integer qaId);
}

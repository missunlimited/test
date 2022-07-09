package com.test.test.service.impl;

import com.test.test.persistence.entity.QuestionAnswer;
import com.test.test.persistence.mapper.QuestionAnswerMapper;
import com.test.test.service.QuestionAnswerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
    private final QuestionAnswerMapper questionAnswerMapper;

    public QuestionAnswerServiceImpl(QuestionAnswerMapper questionAnswerMapper) {
        this.questionAnswerMapper = questionAnswerMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<QuestionAnswer> findAll() {
        List<QuestionAnswer> questionAnswerList = questionAnswerMapper.findAll();
        return questionAnswerList;
    }

    @Override
    @Transactional(readOnly = true)
    public QuestionAnswer findById() {

    }
}

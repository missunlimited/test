package com.lastExam.lastExam.web.rest;

import com.lastExam.lastExam.persistence.entity.QuestionAnswer;
import com.lastExam.lastExam.service.QuestionAnswerService;
import com.lastExam.lastExam.web.response.QuestionAnswerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/questionAnswer")
public class QuestionAnswerRestController {
    private final QuestionAnswerService questionAnswerService;

    public QuestionAnswerRestController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }

    @GetMapping
    public List<QuestionAnswerResponse> findAll() {
        List<QuestionAnswer> questionAnswerList = questionAnswerService.findAll();

        List<QuestionAnswerResponse> questionAnswerResponseList = new ArrayList<>();
        for (QuestionAnswer questionAnswer : questionAnswerList) {
            QuestionAnswerResponse questionAnswerResponse = new QuestionAnswerResponse(questionAnswer.getQaId(),
                    questionAnswer.getQuestion(),
                    questionAnswer.getCorrectAnswer(),
                    questionAnswer.getDummyAnswer1(),
                    questionAnswer.getDummyAnswer2(),
                    questionAnswer.getDummyAnswer3(),
                    questionAnswer.getCorrectFlag());
            questionAnswerResponseList.add(questionAnswerResponse);
        }
        return questionAnswerResponseList;
    }

    @GetMapping("/{qaId}")
    public QuestionAnswerResponse findById(@PathVariable Integer qaId) {
        QuestionAnswer questionAnswer = questionAnswerService.findById(qaId);

        QuestionAnswerResponse questionAnswerResponse = new QuestionAnswerResponse(questionAnswer.getQaId(),
                questionAnswer.getQuestion(),
                questionAnswer.getCorrectAnswer(),
                questionAnswer.getDummyAnswer1(),
                questionAnswer.getDummyAnswer2(),
                questionAnswer.getDummyAnswer3(),
                questionAnswer.getCorrectFlag());
        return questionAnswerResponse;
    }
}

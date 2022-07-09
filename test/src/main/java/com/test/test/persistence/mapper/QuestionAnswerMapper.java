package com.test.test.persistence.mapper;

import com.test.test.persistence.entity.QuestionAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionAnswerMapper {
    @Select({"SELECT qa_id, question, correct_answer, dummy_answer_1, dummy_answer_2, dummy_answer_3, correct_flag"})
    List<QuestionAnswer> findAll();

    @Select({"SELECT qa_id, question, correct_answer, dummy_answer_1, dummy_answer_2, dummy_answer_3, correct_flag WHERE id = {qa_id}"})
    QuestionAnswer findById(Integer qaId);
}

package com.lastExam.lastExam.persistence.mapper;

import com.lastExam.lastExam.persistence.entity.QuestionAnswer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuestionAnswerMapper {
    @Results(
            {
                    @Result(id = true, column = "qa_id", property = "qaId"),
                    @Result(column = "question", property = "question"),
                    @Result(column = "correct_answer", property = "correctAnswer"),
                    @Result(column = "dummy_answer_1", property = "dummyAnswer1"),
                    @Result(column = "dummy_answer_2", property = "dummyAnswer2"),
                    @Result(column = "dummy_answer_3", property = "dummyAnswer3"),
                    @Result(column = "correct_flag", property = "correctFlag"),
                    @Result(column = "answer_start", property = "answerStart"),
                    @Result(column = "answer_finish", property = "answerFinish"),
                    @Result(column = "set_question_id", property = "setQuestion",
                        many = @Many(select = "com.test.test.persistence.mapper.SetQuestionMapper.findAll"))
            }
    )

    @Select({"SELECT qa_id, question, correct_answer, dummy_answer_1, dummy_answer_2, dummy_answer_3, correct_flag"})
    List<QuestionAnswer> findAll();

    @Select({"SELECT qa_id, question, correct_answer, dummy_answer_1, dummy_answer_2, dummy_answer_3, correct_flag WHERE id = {qa_id}"})
    QuestionAnswer findById(Integer qaId);
}

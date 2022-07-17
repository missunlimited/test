package com.lastExam.lastExam.persistence.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

@Mapper
public interface SummaryMapper {
    @Results(
            {
                    @Result(id = true, column = "summary_id", property = "summaryId"),
                    @Result(id = true, column = "correct", property = "correct"),
                    @Result(id = true, column = "set_question_id", property = "setQuestion",
                                one = @One(select = "com.test.test.persistence.mapper.SetQuestionMapper.findAll"))
            }
    )
}

package com.lastExam.lastExam.persistence.mapper;

import com.lastExam.lastExam.persistence.entity.SetQuestion;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SetQuestionMapper {
    @Results(
            {
                    @Result(id = true, column = "set_question", property = "setQuestionId"),
                    @Result(column = "qa_id", property = "QuestionAnswer",
                            one = @One(select = "com.test.test.persistence.mapper.QuestionAnswer.findAll"))
            }
    )

    @Select({"SELECT * FROM question_answer ORDER BY random() LIMIT 5"})
    List<SetQuestionMapper> findAll();

    // ランダムに5問抽出したものをinsertする
    @Insert({"INSERT INTO "})

    @Delete({"DELETE FROM setQuestion"})
    void delete(SetQuestion setQuestion);
}

/* Drop Tables */
DROP TABLE IF EXISTS question_answer;

DROP TABLE IF EXISTS summary;

/* Create question_answer Tables */
CREATE TABLE question_answer
(
    qa_id           SERIAL PRIMARY KEY,
    question        VARCHAR(256),
    correct_answer  VARCHAR(256),
    dummy_answer_1  VARCHAR(256),
    dummy_answer_2  VARCHAR(256),
    dummy_answer_3  VARCHAR(256),
    correct_flag    boolean
);

/* Create summary Tables */
CREATE TABLE summary
(
    summary_id  SERIAL PRIMARY KEY,
    correct     INTEGER,
    time        TIME,
);

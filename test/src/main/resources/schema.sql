/* Drop Tables */
DROP TABLE IF EXISTS question_answer;
DROP TABLE IF EXISTS set_question;
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
    correct_flag    boolean,
    answer_start    TIME,
    answer_finish   TIME
);

/* Create set_question Tables */
CREATE TABLE set_question
(
    set_question_id SERIAL PRIMARY KEY,
    qa_id           SERIAL,
    CONSTRAINT fk_qa_id FOREIGN KEY (qa_id) REFERENCES question_answer(qa_id)
);

/* Create summary Tables */
CREATE TABLE summary
(
    summary_id      SERIAL PRIMARY KEY,
    correct         INTEGER,
    set_question_id SERIAL,
    CONSTRAINT fk_set_question_id FOREIGN KEY (set_question_id) REFERENCES set_question(set_question_id)
);

DROP TABLE IF EXISTS member;

CREATE TABLE IF NOT EXISTS member
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    userId VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    nick_name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
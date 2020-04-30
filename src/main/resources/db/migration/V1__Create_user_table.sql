CREATE TABLE user
(
    id INT AUTO_INCREMENT,
    name VARCHAR(100),
    account_id VARCHAR(50),
    token CHAR(36),
    gmt_create BIGINT,
    gmt_modified BIGINT
);
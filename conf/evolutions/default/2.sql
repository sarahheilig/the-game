-- !Ups
CREATE TABLE User (
    user_id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(160) NOT NULL
)

-- !Downs
DROP TABLE User;
CREATE TABLE `book`(
                       id INT AUTO_INCREMENT,
                       title VARCHAR(200),
                       writer VARCHAR(20),
                       category ENUM('NOVEL','PSYCHOLOGY','LITERATURE','HISTORICAL','RELIGIOUS'),
                       address VARCHAR(200),
                       quantity INT,
                       PRIMARY KEY(`id`)
);
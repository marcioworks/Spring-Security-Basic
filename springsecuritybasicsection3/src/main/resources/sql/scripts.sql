create database sql9646897;

use sql9646897;

CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(500) NOT NULL,
    enabled INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE authorities (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE customer (
    id INT NOT NULL AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL,
    pwd VARCHAR(50) NOT NULL,
    role VARCHAR(50) NOT NULL
    PRIMARY KEY (id)
);

INSERT IGNORE INTO authorities VALUES (NULL, 'happy','write');
INSERT IGNORE INTO users VALUES (NULL, 'happy','12345','1');
INSERT INTO customer VALUES (NULL, 'marcio@teste.com','54321','admin');
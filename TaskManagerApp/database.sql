CREATE DATABASE taskmanager;

USE taskmanager;

CREATE TABLE tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    description TEXT,
    due_date DATE,
    status VARCHAR(20)
);
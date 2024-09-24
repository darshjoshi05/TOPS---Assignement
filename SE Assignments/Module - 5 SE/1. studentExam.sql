-- 1. Create tabek name: Student & Exam

CREATE TABLE STUDENT(
Roll_Number INT PRIMARY KEY,
Name TEXT,
Branch TEXT
);

INSERT INTO STUDENT VALUES 
(1, "Jay", "Computer Science"),
(2, "Suhani", "Electronic"),
(3, "Kriti", "Electronic");

CREATE TABLE EXAM(
Roll_Number INT,
S_CODE VARCHAR(20),
MARKS INT,
P_CODE VARCHAR(20),
FOREIGN KEY (Roll_Number) REFERENCES STUDENT (Roll_Number)
);

INSERT INTO EXAM VALUES 
(1, "CS11", 50, "CS"),
(1, "CS12", 60, "CS"),
(2, "EC101", 66, "EC"),
(2, "EC102", 70, "EC"),
(3, "EC101", 45, "EC"),
(3, "EC102", 50, "EC");




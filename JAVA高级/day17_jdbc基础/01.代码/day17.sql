
CREATE TABLE student(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20),gender VARCHAR(2));

DESC student;

DROP TABLE student;

-- 插入记录
INSERT INTO student(NAME,gender) VALUES('张三','男');

-- 查询
SELECT * FROM student;

-- 更新
UPDATE student SET NAME='王五' WHERE id=1;

DELETE FROM student WHERE id=1;


-- 模拟用户登录
-- 用户表
CREATE TABLE users(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	PASSWORD VARCHAR(20)
)

INSERT INTO users(NAME,PASSWORD) VALUES('eric','123456');
INSERT INTO users(NAME,PASSWORD) VALUES('rose','654321');

SELECT * FROM users;

-- 登录成功：用户输入的用户名和密码和users表的某条记录匹配
-- 登录失败：  找不到匹配的数据
SELECT * FROM users WHERE NAME='eric' AND PASSWORD='123456';

SELECT * FROM users;

SELECT * FROM users WHERE 1=1; -- 1=1 表示恒成立(永远成立，永远真)

-- sql注入
SELECT * FROM users WHERE NAME='eric' OR 1=1 -- 'and password='123456';


-- SELECT * FROM users WHERE NAME='eric';
-- SELECT * FROM users WHERE 1=1;

-- 创建存储过程
DELIMITER $
CREATE PROCEDURE pro_findById(IN sid INT)
BEGIN 
       SELECT * FROM student WHERE id=sid;
END $

CALL pro_findById(4);

-- 带有输出参数的存储过程
DELIMITER $
CREATE PROCEDURE pro_findById2(IN sid INT,OUT sname VARCHAR(20))
BEGIN 
    SELECT NAME INTO sname FROM student WHERE id=sid;
END $

CALL pro_findById2(5,@NAME);

SELECT @NAME;


-- 创建通讯录系统数据库和表
CREATE DATABASE contact_sys

USE contact_sys;

CREATE TABLE contact(
    id VARCHAR(32) PRIMARY KEY,
    NAME VARCHAR(20),
    gender VARCHAR(20),
    age INT,
    phone VARCHAR(20),
    email VARCHAR(20),
    qq VARCHAR(20)
)

SELECT * FROM contact;

INSERT INTO contact(id,NAME,gender,age,phone,email,qq) VALUES('1','eric','男',20,'13222223333','eric@qq.com','44444');

UPDATE contact SET NAME='rose',gender='女',age=30,phone='133222',email='rose@qq.com',qq='3333' WHERE id='1';
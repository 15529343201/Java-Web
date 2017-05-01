-- 创建数据库
CREATE DATABASE jdbc_demo DEFAULT CHARACTER SET utf8;
-- 创建表
USE jdbc_demo;
CREATE TABLE admin(
  id INT PRIMARY KEY AUTO_INCREMENT,
  userName VARCHAR(20),
  pwd VARCHAR(20)
)

-- 存储过程
-- 定义分隔符
DELIMITER $
CREATE PROCEDURE proc_login()
BEGIN
  SELECT * FROM admin;
END $
 
-- 调用
CALL proc_login;

-- 账户表
CREATE TABLE account(
  id INT PRIMARY KEY AUTO_INCREMENT,
  accountName VARCHAR(20),
  money DOUBLE
);
-- 转账
UPDATE account SET money=money-1000 WHERE accountName='张三';
UPDATE account SET money=money+1000 WHERE accountName='李四';

SELECT * form account;
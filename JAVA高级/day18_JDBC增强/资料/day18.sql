-- �������ݿ�
CREATE DATABASE jdbc_demo DEFAULT CHARACTER SET utf8;
-- ������
USE jdbc_demo;
CREATE TABLE admin(
  id INT PRIMARY KEY AUTO_INCREMENT,
  userName VARCHAR(20),
  pwd VARCHAR(20)
)

-- �洢����
-- ����ָ���
DELIMITER $
CREATE PROCEDURE proc_login()
BEGIN
  SELECT * FROM admin;
END $
 
-- ����
CALL proc_login;

-- �˻���
CREATE TABLE account(
  id INT PRIMARY KEY AUTO_INCREMENT,
  accountName VARCHAR(20),
  money DOUBLE
);
-- ת��
UPDATE account SET money=money-1000 WHERE accountName='����';
UPDATE account SET money=money+1000 WHERE accountName='����';

SELECT * form account;
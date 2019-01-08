package cn.itcast.javaee.js.callmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 * ��ʾJava����Mysql�Ĺ���
 * @author AdminTC
 */
public class TestJavaCallMysqlProc {
	public static void main(String[] args) throws Exception{
		//Java���ù��̵��﷨������ֻ��һ��?�ţ��������ֵ
		String  sql = "{call simpleproc(?)}";

		Connection conn = JdbcUtil.getConnection();
		CallableStatement cstmt = conn.prepareCall(sql);
		
		//��������?�������ͣ�?���±��1��ʼ
		cstmt.registerOutParameter(1,Types.INTEGER);

		//ִ�й��̵ĵ���
		cstmt.execute();
		
		//���չ��̵ķ���ֵ
		Integer count = cstmt.getInt(1);
		
		//��ʾ
		System.out.println("����" + count + "���û�");
		
		
		JdbcUtil.close(cstmt);
		JdbcUtil.close(conn);
	}
}

package cn.itcast.javaee.js.callmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 * ��ʾJava����Mysql�ĺ���
 * @author AdminTC
 */
public class TestJavaCallMysqlFunc {
	public static void main(String[] args) throws Exception{
		String  sql = "{? = call hello(?)}";

		Connection conn = JdbcUtil.getConnection();
		CallableStatement cstmt = conn.prepareCall(sql);
		
		//��һ�������?��������
		cstmt.registerOutParameter(1,Types.VARCHAR);
		
		//�ڶ��������?����ֵ
		cstmt.setString(2,"�Ծ�");
		
		//���ú���
		cstmt.execute();
		
		//���շ��ص�ֵ
		String value = cstmt.getString(1);
		
		//��ʾ
		System.out.println(value);
		
		JdbcUtil.close(cstmt);
		JdbcUtil.close(conn);
	}
}

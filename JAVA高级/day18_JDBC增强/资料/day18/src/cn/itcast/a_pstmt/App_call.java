package cn.itcast.a_pstmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import cn.itcast.utils.JdbcUtil;

public class App_call {
	
	// 全局参数
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private CallableStatement cstmt;  // 存储过程
	private ResultSet rs;
	

	// 程序中调用存储过程
	@Test
	public void testCall() throws Exception {
		
		try {
			//1 . 创建连接
			con = JdbcUtil.getConnection();
			//2.  创建执行存储过程的stmt对象
			CallableStatement cstmt = con.prepareCall("CALL proc_login");
			//3.  执行（存储过程）
			rs = cstmt.executeQuery();
			
			// 遍历结果，测试
			if (rs.next()) {
				String name = rs.getString("userName");
				String pwd = rs.getString("pwd");
				// 测试
				System.out.println(name + pwd);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





















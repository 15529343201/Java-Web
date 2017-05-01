package cn.itcast.a_pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import cn.itcast.utils.JdbcUtil;

import java.sql.PreparedStatement;

public class App {
	
	
	// 全局参数
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	// 1. 没有使用防止sql注入的案例
	@Test
	public void testLogin() {
		
		// 1.0 模拟登陆的用户名，密码
		String userName = "tom";
		//String pwd = "8881";
		String pwd = " ' or 1=1 -- ";
		
		// SQL语句
		String sql = "select * from admin where userName='"+userName+"'  and pwd='"+pwd+"' ";
		System.out.println(sql);
		try {
			// 1.1 加载驱动，创建连接
			con = JdbcUtil.getConnection();
			// 1.2 创建stmt对象
			stmt = con.createStatement();
			// 1.3 执行查询
			rs = stmt.executeQuery(sql);
			// 业务判断
			if (rs.next()) {
				System.out.println("登陆成功, 编号：" + rs.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 1.4 关闭
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 2. 使用PreparedStatement, 防止sql注入
	@Test
	public void testLogin2() {
		
		// 1.0 模拟登陆的用户名，密码
		String userName = "tom";
		//String pwd = "8881";
		String pwd = " ' or 1=1 -- ";
		
		// SQL语句
		String sql = "select * from admin where userName=?  and pwd=? ";
		try {
			// 1.1 加载驱动，创建连接
			con = JdbcUtil.getConnection();
			// 1.2 创建pstmt对象
			pstmt = con.prepareStatement(sql);   // 对sql语句预编译
			// 设置占位符值
			pstmt.setString(1, userName);
			pstmt.setString(2, pwd);
			
			// 1.3 执行
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("登陆成功，" + rs.getInt("id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 1.4 关闭
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}











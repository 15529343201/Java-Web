package gz.itcast.b_statement;

import gz.itcast.util.JdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * 使用Statement执行DML语句
 * @author APPle
 *
 */
public class Demo2 {
	private String url = "jdbc:mysql://localhost:3306/day17";
	private String user = "root";
	private String password = "root";

	/**
	 * 增加
	 */
	@Test
	public void testInsert(){
		Connection conn = null;
		Statement stmt = null;
		try {
			//通过工具类获取连接对象
			conn = JdbcUtil.getConnection();
			
			//3.创建Statement对象
			stmt = conn.createStatement();
			
			//4.sql语句
			String sql = "INSERT INTO student(NAME,gender) VALUES('李四','女')";
			
			//5.执行sql
			int count = stmt.executeUpdate(sql);
			
			System.out.println("影响了"+count+"行");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			//关闭资源
			/*if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}*/
			JdbcUtil.close(conn, stmt);
		}
	}
	
	/**
	 * 修改
	 */
	@Test
	public void testUpdate(){
		Connection conn = null;
		Statement stmt = null;
		//模拟用户输入
		String name = "陈六";
		int id = 3;
		try {
			/*//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.获取连接对象
			conn = DriverManager.getConnection(url, user, password);*/
			//通过工具类获取连接对象
			conn = JdbcUtil.getConnection();
			
			//3.创建Statement对象
			stmt = conn.createStatement();
			
			//4.sql语句
			String sql = "UPDATE student SET NAME='"+name+"' WHERE id="+id+"";
			
			System.out.println(sql);
			
			//5.执行sql
			int count = stmt.executeUpdate(sql);
			
			System.out.println("影响了"+count+"行");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			//关闭资源
			/*if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}*/
			JdbcUtil.close(conn, stmt);
		}
	}
	
	/**
	 * 删除
	 */
	@Test
	public void testDelete(){
		Connection conn = null;
		Statement stmt = null;
		//模拟用户输入
		int id = 3;
		try {
			/*//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.获取连接对象
			conn = DriverManager.getConnection(url, user, password);*/
			//通过工具类获取连接对象
			conn = JdbcUtil.getConnection();
			
			//3.创建Statement对象
			stmt = conn.createStatement();
			
			//4.sql语句
			String sql = "DELETE FROM student WHERE id="+id+"";
			
			System.out.println(sql);
			
			//5.执行sql
			int count = stmt.executeUpdate(sql);
			
			System.out.println("影响了"+count+"行");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			//关闭资源
			/*if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}*/
			JdbcUtil.close(conn, stmt);
		}
	}
}

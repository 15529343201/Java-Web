package gz.itcast.b_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * 使用Statement对象执行静态sql语句
 * @author APPle
 *
 */
public class Demo1 {

	private String url = "jdbc:mysql://localhost:3306/day17";
	private String user = "root";
	private String password = "root";
	/**
	 * 执行DDL语句(创建表)
	 */
	@Test
	public void test1(){
		Statement stmt = null;
		Connection conn = null;
		try {
			//1.驱动注册程序
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.获取连接对象
			conn = DriverManager.getConnection(url, user, password);
			
			//3.创建Statement
			stmt = conn.createStatement();
			
			//4.准备sql
			String sql = "CREATE TABLE student(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20),gender VARCHAR(2))";
			
			//5.发送sql语句，执行sql语句,得到返回结果
			int count = stmt.executeUpdate(sql);
			
			//6.输出
			System.out.println("影响了"+count+"行！");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			//7.关闭连接(顺序:后打开的先关闭)
			if(stmt!=null)
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
				}
		}		
	}
	
	
	
}

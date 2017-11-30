package cn.itcast.c_dbcp;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

public class App_DBCP {
	//1.硬编码方式实现连接池
	@Test
	public void testDbcp() throws Exception{
		//DBCP连接池核心类
		BasicDataSource dataSource=new BasicDataSource();
		//连接池参数配置:初始化连接数,最大连接数/连接字符串,驱动,用户,密码
		dataSource.setUrl("jdbc:mysql:///jdbc_demo");//数据库连接字符串
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");//数据库驱动
		dataSource.setUsername("root");//数据库连接用户
		dataSource.setPassword("root");//数据库连接密码
		dataSource.setInitialSize(3);//初始化连接
		dataSource.setMaxActive(6);//最大连接
		dataSource.setMaxIdle(3000);//最大空闲时间
		
		//获取连接
		Connection con=dataSource.getConnection();
		con.prepareStatement("delete from admin where id=3").executeUpdate();
		//关闭
		con.close();
	}
	
	//2.【推荐】配置方式实现连接池,便于维护
	@Test
	public void testProp() throws Exception{
		//加载prop配置文件
		Properties prop=new Properties();
		//获取文件流
		InputStream inStream=App_DBCP.class.getResourceAsStream("db.properties");
		//加载属性配置文件
		prop.load(inStream);
		//根据prop配置,直接创建数据源对象
		DataSource dataSource=BasicDataSourceFactory.createDataSource(prop);
		
		//获取连接
		Connection con=dataSource.getConnection();
		con.prepareStatement("delete from admin where id=1").executeUpdate();
		//关闭
		con.close();
	}

}

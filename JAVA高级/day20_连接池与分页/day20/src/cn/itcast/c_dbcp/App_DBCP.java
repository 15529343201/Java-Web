package cn.itcast.c_dbcp;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

public class App_DBCP {
	//1.Ӳ���뷽ʽʵ�����ӳ�
	@Test
	public void testDbcp() throws Exception{
		//DBCP���ӳغ�����
		BasicDataSource dataSource=new BasicDataSource();
		//���ӳز�������:��ʼ��������,���������/�����ַ���,����,�û�,����
		dataSource.setUrl("jdbc:mysql:///jdbc_demo");//���ݿ������ַ���
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");//���ݿ�����
		dataSource.setUsername("root");//���ݿ������û�
		dataSource.setPassword("root");//���ݿ���������
		dataSource.setInitialSize(3);//��ʼ������
		dataSource.setMaxActive(6);//�������
		dataSource.setMaxIdle(3000);//������ʱ��
		
		//��ȡ����
		Connection con=dataSource.getConnection();
		con.prepareStatement("delete from admin where id=3").executeUpdate();
		//�ر�
		con.close();
	}
	
	//2.���Ƽ������÷�ʽʵ�����ӳ�,����ά��
	@Test
	public void testProp() throws Exception{
		//����prop�����ļ�
		Properties prop=new Properties();
		//��ȡ�ļ���
		InputStream inStream=App_DBCP.class.getResourceAsStream("db.properties");
		//�������������ļ�
		prop.load(inStream);
		//����prop����,ֱ�Ӵ�������Դ����
		DataSource dataSource=BasicDataSourceFactory.createDataSource(prop);
		
		//��ȡ����
		Connection con=dataSource.getConnection();
		con.prepareStatement("delete from admin where id=1").executeUpdate();
		//�ر�
		con.close();
	}

}

package cn.itcast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.dao.IAdminDao;
import cn.itcast.entity.Admin;
import cn.itcast.utils.JdbcUtil;

/**
 * 2. ���ݷ��ʲ�ӿڵ�ʵ����
 * (����DbUtils�����jdbc����)
 * @author Jie.Yuan
 *
 */
public class AdminDao implements IAdminDao {

	private Connection con;
	private QueryRunner qr = new QueryRunner();

	@Override
	public Admin findByNameAndPwd(Admin admin) {
		String sql = "select * from admin where userName=? and pwd=?";
		try{
			con = JdbcUtil.getConnection();
			Admin ad = qr.query(con, sql, 
					new BeanHandler<Admin>(Admin.class), 
					admin.getUserName(),
					admin.getPwd());
			return ad;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(con, null, null);
		}
	}

	@Override
	public void save(Admin admin) {
		String sql = "INSERT INTO admin(userName,pwd) VALUES(?,?);";
		try {
			con = JdbcUtil.getConnection();
			// ʹ��DbUtils����ķ�������
			qr.update(con, sql, admin.getUserName(),admin.getPwd());
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(con, null, null);
		}
		
	}

	@Override
	public boolean userExists(String name) {
		String sql = "select id from admin where userName=?";
		try {
			con = JdbcUtil.getConnection();
			Integer in = qr.query(con, sql, new ScalarHandler<Integer>(), name);
			if (in != null){
				return true;
			}
			return false;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(con, null, null);
		}
	}

}

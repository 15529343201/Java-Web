package cn.itcast.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.dao.AdminDao;
import cn.itcast.entity.Admin;
import cn.itcast.utils.JdbcUtils;

public class AdminService {

	private AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin){
		try {
			return adminDao.login(admin);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Admin> getAll(){
		try {
			return adminDao.getAll();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

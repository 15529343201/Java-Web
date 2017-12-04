package cn.itcast.service.impl;

import cn.itcast.dao.IAdminDao;
import cn.itcast.dao.impl.AdminDao;
import cn.itcast.entity.Admin;
import cn.itcast.service.IAdminService;

public class AdminService implements IAdminService{
	
	// 创建dao对象
	private IAdminDao adminDao = new AdminDao();

	@Override
	public Admin findByNameAndPwd(Admin admin) {
		try {
			return adminDao.findByNameAndPwd(admin);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}

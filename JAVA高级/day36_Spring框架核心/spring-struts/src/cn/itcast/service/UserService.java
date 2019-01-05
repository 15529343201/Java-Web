package cn.itcast.service;

import cn.itcast.dao.UserDao;

public class UserService {
	
	//IOCÈÝÆ÷×¢Èë
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save() {
		userDao.save();
	}
}

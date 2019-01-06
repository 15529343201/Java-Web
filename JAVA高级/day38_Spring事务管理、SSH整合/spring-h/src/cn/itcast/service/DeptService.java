package cn.itcast.service;

import cn.itcast.dao.DeptDao;
import cn.itcast.entity.Dept;

// ÒµÎñÂß¼­²ã
public class DeptService {
	

	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void save(Dept dept){
		deptDao.save(dept);
	}
}

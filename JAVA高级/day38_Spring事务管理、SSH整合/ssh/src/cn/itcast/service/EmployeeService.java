package cn.itcast.service;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import cn.itcast.dao.EmployeeDao;
import cn.itcast.entity.Employee;

public class EmployeeService {
	
	// IOC×¢Èë
	private EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * ²éÑ¯
	 * @param emp
	 */
	public Employee findById(Serializable id) {
		Employee emp = employeeDao.findById(id);
		return emp;
	}
}

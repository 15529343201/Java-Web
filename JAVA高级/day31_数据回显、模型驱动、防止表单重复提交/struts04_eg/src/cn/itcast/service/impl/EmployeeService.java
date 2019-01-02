package cn.itcast.service.impl;

import java.util.List;

import cn.itcast.dao.IEmployeeDao;
import cn.itcast.dao.impl.EmployeeDao;
import cn.itcast.entity.Employee;
import cn.itcast.service.IEmployeeService;

public class EmployeeService implements IEmployeeService{
	
	private IEmployeeDao employeeDao = new EmployeeDao();

	public Employee findById(int id) {
		try {
			return employeeDao.findById(id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<Employee> getAll() {
		try {
			return employeeDao.getAll();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void save(Employee emp) {
		try {
			employeeDao.save(emp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void update(Employee emp) {
		try {
			employeeDao.update(emp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

}

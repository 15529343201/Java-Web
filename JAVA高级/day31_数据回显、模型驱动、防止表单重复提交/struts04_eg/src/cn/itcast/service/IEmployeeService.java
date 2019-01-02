package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.Employee;

/**
 * 业务逻辑层接口
 *
 */
public interface IEmployeeService {

	/**
	 * 查询全部员工
	 */
	List<Employee> getAll();
	
	/**
	 * 根据主键查询
	 */
	Employee findById(int id);
	
	/**
	 * 添加员工
	 */
	void save(Employee emp);
	
	/**
	 * 修改员工
	 */
	void update(Employee emp);
	
}
 
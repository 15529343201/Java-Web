package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Employee;

/**
 * 数据访问层接口
 *
 */
public interface IEmployeeDao {

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
 
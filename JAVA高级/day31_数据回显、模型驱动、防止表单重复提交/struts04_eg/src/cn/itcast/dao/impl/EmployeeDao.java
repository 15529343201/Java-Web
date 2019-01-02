package cn.itcast.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.dao.IEmployeeDao;
import cn.itcast.entity.Employee;
import cn.itcast.utils.JdbcUtils;

public class EmployeeDao implements IEmployeeDao{

	public Employee findById(int id) {
		String sql = "select * from employee where id=?";
		try {
			return JdbcUtils.getQuerrRunner().query(sql, new BeanHandler<Employee>(Employee.class),id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Employee> getAll() {
		String sql = "select * from employee";
		try {
			return JdbcUtils.getQuerrRunner().query(sql, new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void save(Employee emp) {
		String sql = "insert into employee(empName,workDate) values(?,?)";
		try {
			JdbcUtils.getQuerrRunner().update(sql, emp.getEmpName(),emp.getWorkDate());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	public void update(Employee emp) {
		String sql = "update employee set empName=?,workDate=? where id=?";
		try {
			JdbcUtils.getQuerrRunner().update(sql, emp.getEmpName(),emp.getWorkDate(),emp.getId());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}

}

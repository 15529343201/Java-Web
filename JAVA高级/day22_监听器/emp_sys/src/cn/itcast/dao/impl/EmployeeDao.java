package cn.itcast.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.dao.IEmployeeDao;
import cn.itcast.entity.Employee;
import cn.itcast.utils.JdbcUtils;

public class EmployeeDao implements IEmployeeDao {

	@Override
	public List<Employee> getAll() {
		String sql = "select * from employee";
		try {
			return JdbcUtils.getQueryRuner()//
				.query(sql, new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

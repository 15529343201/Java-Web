package cn.itcast.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import cn.itcast.dao.IEmployeeDao;
import cn.itcast.entity.Employee;

public class EmployeeDao implements IEmployeeDao {

	// 容器注入
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void delete(int id) {
		// HQL查询区分大小写： 对象/对象属性严格区分大小写
		// 数据库关键字不区分
		sessionFactory.getCurrentSession()//
				.createQuery("delete from Employee where id=?")//
				.setParameter(0, id)//
				.executeUpdate();
	}

	@Override
	public Employee findById(int id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll(String employeeName) {
		return sessionFactory.getCurrentSession()//
			.createQuery("from Employee where empName like ?")//
			.setParameter(0, "%" +employeeName + "%")//
			.list();
	}

	@Override
	public void save(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
	}

	@Override
	public void update(Employee emp) {
		sessionFactory.getCurrentSession().update(emp);
	}

}

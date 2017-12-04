package cn.itcast.c_session;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 监听此对象绑定到session上的过程，需要实现session特定接口
 * @author Jie.Yuan
 *
 */
public class Admin implements HttpSessionBindingListener {

	private int id;
	private String name;
	
	public Admin() {
		super();
	}
	public Admin(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	// 构造函数
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 对象放入session
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Admin对象已经放入session");
	}
	// 对象从session中移除
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Admin对象从session中移除！");
	}
	
}

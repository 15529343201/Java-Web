package cn.itcast.d_type;

import java.util.Date;

/**
 * Struts核心业务： 请求数据自动封装以及类型转换
 * @author Jie.Yuan
 *
 */
public class UserAction {
	
	 // 对象类型，一定给get方法
	private User user; 
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}

	// 处理注册请求
	public String register() {
		System.out.println(user.getName());
		System.out.println(user.getPwd());
		System.out.println(user.getAge());
		System.out.println(user.getBirth());
		return "success";
	}
}

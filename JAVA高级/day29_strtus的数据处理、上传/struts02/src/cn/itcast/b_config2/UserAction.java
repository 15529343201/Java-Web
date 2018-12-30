package cn.itcast.b_config2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction {
	
	private String userName;
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	// Action中业务处理方法
	public String login() {
		System.out.println("UserAction.login()");
		return "success";
	}
	
	public String register() {
		System.out.println("register()");
		return "success";
	}
}

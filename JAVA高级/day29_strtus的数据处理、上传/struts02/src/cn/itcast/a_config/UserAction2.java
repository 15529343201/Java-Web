package cn.itcast.a_config;

import com.opensymphony.xwork2.Action;

public class UserAction2 implements Action{

	//Action中业务处理方法
	public String login(){
		System.out.println("UserAction.login()");
		return "success";
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

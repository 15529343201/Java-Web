package cn.itcast.a_config;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction3 extends ActionSupport{
	//Action中业务处理方法
	public String login(){
		System.out.println("UserAction.login()");
		return "success";
	}

}
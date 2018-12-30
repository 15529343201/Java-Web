
package cn.itcast.a_config;

public class UserAction{
	public String getUserName() {
		return userName;
	}
	private String userName;
	public void setUserName(String userName){
		this.userName=userName;
	}
	//Action中业务处理方法
	public String login(){
		System.out.println("UserAction.login()"+userName);
		return "login";
	}
	public String register(){
		System.out.println("register()"+userName);
		return "register";
	}

}


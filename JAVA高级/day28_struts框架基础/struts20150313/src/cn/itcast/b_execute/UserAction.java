package cn.itcast.b_execute;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserAction extends ActionSupport{
	//�����⣺������ʲôʱ��ִ��?(����/����)��ִ��action�ഴ�������Ǵ�����������
	public UserAction(){
		System.out.println("UserAction.enclosing_method");
	}
	/*private String userName;
	private String pwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}*/
	private User user=new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login(){
		//��ȡ�û�������
		System.out.println(user.getUserName());
		System.out.println(user.getPwd());
		//�����ݱ��浽��
		ActionContext ac=ActionContext.getContext();
		//�õ�����request��map
		Map<String, Object> request=ac.getContextMap();
		//�õ�����session��map
		Map<String, Object> session=ac.getSession();
		//�õ�����servletContext��map
		Map<String, Object> application=ac.getApplication();
		//����
		request.put("request_data", "request_data");
		session.put("session_data", "session_data");
		application.put("application_data", "application_data");
		return "login";
	}

}

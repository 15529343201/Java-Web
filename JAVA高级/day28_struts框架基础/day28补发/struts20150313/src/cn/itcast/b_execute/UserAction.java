package cn.itcast.b_execute;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	// 面试题： 拦截器什么时候执行？ (访问/启动)  先执行action类创建，先执行拦截器？
	// --》 1. 用户访问时候按顺序执行18个拦截器；
	//---》 2. 先执行Action类的创建，再执行拦截器； 最后拦截器执行完，再执行业务方法
	public UserAction() {
		System.out.println("UserAction.enclosing_method()");
	}

	/**
	 * 
	 
	private String userName;
	private String pwd;
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	*/
	private User user = new User();
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	public String login() {
		// 获取用户名密码
		System.out.println(user.getUserName());
		System.out.println(user.getPwd());
		
		
		// 把数据保存到域
		ActionContext ac = ActionContext.getContext();
		
		// 得到代表request的map
		Map<String, Object> request = ac.getContextMap();
		// 得到代表session的map
		Map<String, Object> session = ac.getSession();
		// 得到代表servletContext的map
		Map<String, Object> application = ac.getApplication();
		
		// 保存
		request.put("request_data", "request_data");
		session.put("session_data", "session_data");
		application.put("application_data", "application_data");
		
		
		return "login";
	}
}

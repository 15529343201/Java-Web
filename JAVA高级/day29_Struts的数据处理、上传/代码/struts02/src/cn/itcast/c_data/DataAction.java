package cn.itcast.c_data;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据处理, 方式3： 实现接口的方法
 * @author Jie.Yuan
 *
 */
public class DataAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{
	
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	// struts运行时候，会把代表request的map对象注入
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	// 注入session
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	// 注入application
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}


	@Override
	public String execute() throws Exception {
		
	 	// 数据
	 	request.put("request_data", "request_data1_actionAware");
		session.put("session_data", "session_data1_actionAware");
		application.put("application_data", "application_data1_actionAware");
//		
		return SUCCESS;
	}

}









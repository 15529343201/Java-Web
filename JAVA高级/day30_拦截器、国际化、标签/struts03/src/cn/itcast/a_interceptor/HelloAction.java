package cn.itcast.a_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action开发测试
 *
 */
public class HelloAction extends ActionSupport{

	public HelloAction() {
		System.out.println("1. Action实例创建了");
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("3. 执行了请求处理的方法: execute");
		return super.execute();
	}
}

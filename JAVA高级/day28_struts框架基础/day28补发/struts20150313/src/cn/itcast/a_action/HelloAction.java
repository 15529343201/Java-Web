package cn.itcast.a_action;

import com.opensymphony.xwork2.ActionSupport;

// 开发action： 处理请求
public class HelloAction extends ActionSupport {
	
	public HelloAction(){
		System.out.println("创建Action实例：HelloAction.HelloAction()");
	}
	
	// 处理请求
	public String add() throws Exception {
		System.out.println("访问到了action，正在处理请求");
		System.out.println("调用service");
		return "success";
	}
}

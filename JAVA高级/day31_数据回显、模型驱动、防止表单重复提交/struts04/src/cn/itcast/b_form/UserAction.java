package cn.itcast.b_form;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 1. 数据回显
 * 2. 模型驱动
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	// 封装请求数据
	private User user = new User();
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	// 实现模型驱动接口方法
	public User getModel() {
		return user;
	}
	
	
	public String add() {
		// 测试： 使用了模型驱动，是否数据正常？ Ok
		System.out.println(user);
		return "success";
	}
	
	
	// 进入修改页面
	public String viewUpdate() {
		// 模拟一个对象(先获取一个id，再根据id调用service查询，把查到的结果保存到域)
		User userInfo = new User();
		userInfo.setUserName("Jack");
		userInfo.setEmail("yuanjie@itcast.cn");
		
		ActionContext ac = ActionContext.getContext();
//		Map<String,Object> request = (Map<String, Object>) ac.get("request");
//		request.put("userInfo", userInfo);
		
		/************* 数据回显***************/
		// 获取值栈
		ValueStack vs = ac.getValueStack();
		vs.pop();// 移除栈顶元素
		vs.push(userInfo);  // 入栈
		
		
		// 进入修改页面
		return "viewUpdate";
	}
	
	// 业务方法
	public String index() {
		// 保存数据到request域
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> request = (Map<String, Object>) ac.get("request");
		request.put("cn", "China");
		
		return SUCCESS;
	}
}









package cn.itcast.action;

import java.util.List;

import cn.itcast.entity.Admin;
import cn.itcast.service.AdminService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	// ---------1. 封装请求数据-----------
	private Admin admin;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	// ---------2. 调用的Service-----------
	private AdminService adminService = new AdminService();
	
	// 登陆
	public String login() {
		try {
			Admin userInfo = adminService.login(admin);
			// 判断
			if (userInfo == null){
				// 登陆失败
				return "input";
			}
			// 登陆成功：数据保存在session中
			ActionContext.getContext().getSession().put("userInfo", userInfo);
			
			// 登陆成功
			return "loginSuccess";
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	// 列表
	public String list() {
		try {
			// 查询全部
			List<Admin> list = adminService.getAll();
			// 保存到request
			ActionContext.getContext().getContextMap().put("listAdmin", list);
			return "list";
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	public String add() {
		return null;
	}
	
	
}

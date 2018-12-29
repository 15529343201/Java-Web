package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.entity.User;
import cn.itcast.framework.action.LoginAction;
import cn.itcast.service.UserService;

//控制器
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建action对象,调用登陆方法
		LoginAction loginAction = new LoginAction();
		Object uri=loginAction.login(request,response);
		
		//跳转
		if(uri instanceof String){
			response.sendRedirect(request.getContextPath()+uri.toString());
		}else{
			((RequestDispatcher)uri).forward(request,response);
		}
		
		
	}
	
	

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);

		
	}

}

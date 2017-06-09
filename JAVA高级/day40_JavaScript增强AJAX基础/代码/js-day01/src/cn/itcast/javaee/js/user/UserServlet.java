package cn.itcast.javaee.js.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 基于HTML，以GET或POST方式，检查注册用户名是否在数据库中已存在 
 * @author AdminTC
 */
public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String username = request.getParameter("username");
		byte[] buf = username.getBytes("ISO8859-1");
		username = new String(buf,"UTF-8");
		System.out.println("username=" + username);
		String tip = "<font color='green'>可以注册</font>";
		if("杰克".equals(username)){
			tip = "<font color='red'>该用户已存在</font>";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		System.out.println("username=" + username);
		
		String tip = "images/MsgSent.gif";
		if("杰克".equals(username)){
			tip = "images/MsgError.gif";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
	}
}








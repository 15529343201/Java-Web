package cn.itcast.javaee.js.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 检查注册用户名和密码是否存在
 * @author AdminTC
 */
public class UserServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");//哈哈
		String password = request.getParameter("password");//123
		String tip = "images/MsgSent.gif";
		if("哈哈".equals(username) && "123".equals(password)){
			tip = "images/MsgError.gif";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
	}
}








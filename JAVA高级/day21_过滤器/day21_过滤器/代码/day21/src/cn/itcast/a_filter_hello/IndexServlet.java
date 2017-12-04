package cn.itcast.a_filter_hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet:
 * 	 处理用户http request
 * @author Jie.Yuan
 *
 */
public class IndexServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 设置POST提交的请求的编码
		request.setCharacterEncoding("UTF-8");
		// 设置相应体的编码
		response.setCharacterEncoding("UTF-8");
		// 设置页面打开时候时候的编码格式、 设置相应体的编码
		response.setContentType("text/html;charset=UTF-8");
		
		
		// GET提交中文
		String str = request.getParameter("");
		str = new String(str.getBytes("ISO8859-1"),"UTF-8");
		
		
		response.sendRedirect(request.getContextPath() + "/servletTest");
//		request.getRequestDispatcher("/servletTest").forward(request, response);
	}

}

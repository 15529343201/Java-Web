package cn.itcast.javaee.js.time;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 回顾传统Web应用请求和响应特点【显示当前时间】 
 * @author AdminTC
 */
public class TimeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//测试
		System.out.println("GET");
		//构造SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将当前日期按照指定格式输出成字符串
		String nowStr = sdf.format(new Date());
		//将结果绑定到request域对象中
		request.setAttribute("nowStr",nowStr);
		//转发到06_time.jsp页面
		request.getRequestDispatcher("/06_time.jsp").forward(request,response);
	}
}








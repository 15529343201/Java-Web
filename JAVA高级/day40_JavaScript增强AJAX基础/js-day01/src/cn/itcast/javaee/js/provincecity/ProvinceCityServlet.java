package cn.itcast.javaee.js.provincecity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 基于XML，以POST方式，完成省份-城市二级下拉联动
 * @author AdminTC
 */
public class ProvinceCityServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String province = request.getParameter("province");
		
		//通知AJAX异步对象，服务器响应的数据为xml格式的
		response.setContentType("text/xml;charset=UTF-8");
		//获取字符输出流
		PrintWriter pw = response.getWriter();
		
		pw.write("<?xml version='1.0' encoding='UTF-8'?>");
		pw.write("<root>");
								
		
		if("广东".equals(province)){
			pw.write("<city>广州</city>");
			pw.write("<city>深圳</city>");
			pw.write("<city>中山</city>");
		}else if("湖南".equals(province)){
			pw.write("<city>长沙</city>");
			pw.write("<city>株洲</city>");
			pw.write("<city>湘潭</city>");
			pw.write("<city>岳阳</city>");
		}
		
		
		pw.write("</root>");
		pw.flush();
		pw.close();
	}
}







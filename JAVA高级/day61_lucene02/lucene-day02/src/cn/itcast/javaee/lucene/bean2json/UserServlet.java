package cn.itcast.javaee.lucene.bean2json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;

/**
 * 用Servlet返回JSON文本动态创建DataGrid
 * @author AdminTC
 */
public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		this.doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//收集DataGrid向服务器发送的参数--page(当前页号)
		String page = request.getParameter("page");
		System.out.println("page=" + page);
		
		//收集DataGrid向服务器发送的参数--rows(当前需要显示的记录数)
		String rows = request.getParameter("rows");
		System.out.println("rows=" + rows);
		
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"哈哈",1000,"男"));
		userList.add(new User(2,"呵呵",2000,"男"));
		userList.add(new User(3,"嘻嘻",3000,"女"));
		userList.add(new User(4,"笨笨",4000,"男"));
		userList.add(new User(5,"聪聪",5000,"男"));
		userList.add(new User(6,"月月",6000,"女"));
		userList.add(new User(7,"花花",7000,"女"));
		
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		map.put("total",userList.size());
		map.put("rows",userList);
		
		JSONArray jsonArray = JSONArray.fromObject(map);
		String jsonJAVA = jsonArray.toString();
		
		jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
		
		//以流的方式将JSON文本输出到DateGrid组件中
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(jsonJAVA);
		pw.flush();
		pw.close();
	}
}










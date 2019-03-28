package cn.itcast.javaee.lucene.fy.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import cn.itcast.javaee.lucene.fy.entity.Page;
import cn.itcast.javaee.lucene.fy.service.ArticleService;

public class ArticleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		this.doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		try {
			
			request.setCharacterEncoding("UTF-8");
			
			//获取关键字
			String keywords = request.getParameter("keywords");//培训
			if(keywords == null || keywords.trim().length()==0){
				keywords = "培训";//默认值
			}
			
			//获取当前页号
			String temp = request.getParameter("page");//核心
			if(temp == null || temp.trim().length()==0){
				temp = "1";//默认值
			}
				
			//调用业务层
			ArticleService articleService = new ArticleService(); 
			Page page = articleService.show(keywords,Integer.parseInt(temp));
			
			//构造Map对象
			Map<String,Object> map = new LinkedHashMap<String,Object>();
			map.put("total",page.getAllRecordNO());
			map.put("rows",page.getArticleList());
			
			//第三方工具将Map转成JSON
			JSONArray jsonArray = JSONArray.fromObject(map);
			String jsonJAVA = jsonArray.toString();
			
			//去掉二边的[]符号
			jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
			
			//以IO的流方式响应到DataGrid组件
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.write(jsonJAVA);
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}







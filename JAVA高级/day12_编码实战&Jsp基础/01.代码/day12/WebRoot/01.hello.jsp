<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>第一个jsp页面</title>  
  </head>
  
  <body>
    <%
    	//写java代码
    	//获取当前时间
    	SimpleDateFormat sdf = new SimpleDateFormat();
    	String curDate = sdf.format(new Date());
    	//输出内容到浏览器
    	//response.getWriter().write("");
    	out.write("当前时间为2："+curDate);
     %>
  </body>
</html>

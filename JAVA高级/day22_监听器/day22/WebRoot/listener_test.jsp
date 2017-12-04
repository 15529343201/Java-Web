<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="cn.itcast.c_session.Admin"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  	test!
  	<%
  	
  		//request.setAttribute("cn","China");
  		//session.invalidate();  //销毁session
  		
  		//session.setAttribute("userName","Jack");
  		//session.removeAttribute("userName");
  		//session.setAttribute("userName","Jack_new");
  		
  		session.setAttribute("userInfo",new Admin());
  		session.removeAttribute("userInfo");
  	%>
  </body>
</html>

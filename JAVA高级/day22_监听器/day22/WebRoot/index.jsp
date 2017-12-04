<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--引入jstl国际化与格式化标签库 --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  <%
  	request.setAttribute("date",new Date());
  %>
  
  <body>
  	<!-- 
  		格式化金额 
  			格式: 0.00   保留2为小数，会自动补0
  			     #.##  保留2为小数，不自动补0
  	-->
  	<fmt:formatNumber pattern="#.##" value="100.99"></fmt:formatNumber>
  	
  	<!-- 格式化日期 -->
  	<fmt:formatDate pattern="yyyy-MM-dd" value="${date}"/>
  </body>
</html>

















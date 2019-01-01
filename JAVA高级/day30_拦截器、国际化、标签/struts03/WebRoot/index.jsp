<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<!-- 页面： 必须要拿到ValueStack -->
  	
     <br/>1. 取根元素的值<br/>
     <s:property value="user.id"/> 
     <s:property value="user.name"/> 
     <s:property value="user.address"/> 
     <s:property value="user.address.city"/> 
     <s:property value="user.address.province"/> 
     
      <br/>2. 取非根元素的值<br/>
      <s:property value="#request.cn"/>
      <s:property value="#session.Session_data"/>
      <s:property value="#application.Application_data"/>    <br/>
     
      <!-- 自动找request/session/application,找到后立刻返回 -->
      <s:property value="#request_data"/>
      <s:property value="#attr.Session_data"/>
      <s:property value="#attr.Application_data"/>  <br/>
      
      <!-- 获取请求的参数数据 -->
      <s:property value="#parameters.userName"/>
     
     <!-- struts的调试标签：可以观测值栈数据 -->
     <s:debug></s:debug>
  </body>
</html>








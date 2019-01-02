<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">   
  </head>
  
  <body>
  	<%@taglib uri="/struts-tags" prefix="s" %>
  	
  	<!-- 服务器标签 : 最终别解析为html标签-->
  	<s:form action="/user_login" method="post" name="frmLogin" id="frmLogin">
  		
  		用户名：<s:textfield name="user.name"></s:textfield>
  		密码：<s:textfield name="user.pwd"></s:textfield>
  		<s:submit value="登陆"></s:submit>
  	</s:form>
  	
  
  </body>
</html>

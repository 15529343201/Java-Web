<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<%
  	ResourceBundle bundle = ResourceBundle.getBundle("cn.itcast.f_i18n.msg",request.getLocale());
  	%>
    <title><%=bundle.getString("title") %></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  <form name="frmLogin" action="${pageContext.request.contextPath }/admin?method=login" method="post">
  	<table align="center" border="1">
  		<tr>
  			<td><%=bundle.getString("username") %></td>
  			<td>
  				<input type="text" name="userName">
  			</td>
  		</tr>
  		<tr>
  			<td><%=bundle.getString("pwd") %></td>
  			<td>
  				<input type="password" name="pwd">
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<input type="submit" value="<%=bundle.getString("submit") %>">
  			</td>
  		</tr>
  	</table>
  </form>
  </body>
</html>

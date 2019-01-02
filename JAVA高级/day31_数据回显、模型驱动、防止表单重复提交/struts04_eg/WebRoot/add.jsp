<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Add</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  	<s:form action="/emp_save" method="post">
  		<!-- 防止表单重复提交，第一步：生成id(客户端、服务器) -->
  		<s:token></s:token>
  		
  		<table>
  			<tr>
  				<td>员工名：</td>
  				<td><s:textfield name="empName" /></td>
  			</tr>
  			<tr>
  				<td>日期：</td>
  				<td><s:textfield name="workDate" /></td>
  			</tr>
  			<tr>
  				<td colspan="2">
  					<s:submit value="保存员工"></s:submit>
  				</td>
  			</tr>
  		</table>
  	</s:form>
  </body>
</html>

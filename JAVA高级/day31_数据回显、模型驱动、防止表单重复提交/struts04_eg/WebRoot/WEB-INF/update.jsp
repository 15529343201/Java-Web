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
  	<s:form action="/emp_update" method="post">
  		<!-- 隐藏域，保存主键 -->
  		<s:hidden name="id"></s:hidden>
  		
  		<table>
  			<tr>
  				<td>员工名：</td>
  				<td><s:textfield name="empName" /></td>
  			</tr>
  			<tr>
  				<td>日期：</td>
  				<!-- 
  				<td><s:date name="workDate" format="yyyy-MM-dd"/>
  				    <s:hidden name="workDate"></s:hidden>
  				</td>
  				 -->
  				 <td>
  				 	<s:textfield name="workDate" />
  				 </td>
  			</tr>
  			<tr>
  				<td colspan="2">
  					<s:submit value="修改员工"></s:submit>
  				</td>
  			</tr>
  		</table>
  	</s:form>
  </body>
</html>
	
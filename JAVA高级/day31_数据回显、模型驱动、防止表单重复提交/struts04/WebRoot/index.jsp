<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  	 <br/>获取request域数据<br/>
  	 <!-- property 标签是对象类型的标签，默认支持ognl表达式, 会从根元素去China名称对应的值 -->
  	 <s:property value="China"/>		<br/>
  	 <!-- 如果直接赋值，需要用单引号 -->
  	 <s:property value="'China'"/>		<br/>
  	 <s:property value="#request.cn"/>		<br/>
  	 <s:property value="%{#request.cn}"/>		<br/> <!-- 同上 -->
  	 
  	 <!-- 值类型的标签，value值默认就是值类型，不支持ognl表达式 -->
  	 国家：<s:textfield name="txtCountry" value="%{#request.cn}"></s:textfield>
  </body>
</html>







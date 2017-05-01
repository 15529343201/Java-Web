<%@ page 
 	language="java" 
 	import="java.util.*" 
 	pageEncoding="utf-8"
 	isErrorPage="true"
 	%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>错误处理页面</title>  
  </head>
  
  <body>
  亲， 系统发生小小的错误，请耐心等待，管理员正在加紧抢修中...
  错误原理：<%=exception.getMessage() %>
  </body>
</html>

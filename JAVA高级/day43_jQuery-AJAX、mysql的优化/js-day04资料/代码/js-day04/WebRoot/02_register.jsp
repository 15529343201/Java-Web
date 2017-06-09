<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>检查注册用户名和密码是否存在</title>
    <script type="text/javascript" src="js/jquery-1.8.2.js"></script>
  </head>
  <body>
	
	<!-- 
		在异步提交的方式下，form标签的action和method属性没有意义
	-->
	<form action="01_time.jsp" method="GET">
		<table border="2" align="center">
			<tr>
				<th>用户名</th>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="检查" style="width:111px"/>
				</td>
			</tr>
		</table>
	</form>
	
	<span></span>
	
	
	<script type="text/javascript">
		$(":button").click(function(){
			var username = $(":text").val();//哈哈
			var password = $(":password").val();//123
			var url = "${pageContext.request.contextPath}/servlet/UserServlet?time="+new Date().getTime();
			/*手工写JSON文本
			var sendData = {
				"username" : username,
				"password" : password
			};
			*/
			var sendData = $("form").serialize();
			$.post(url,sendData,function(backDate){
				//backDate：
				//如果服务器返回html，即backDate就是string，不要解析
				//如果服务器返回json，即backDate就是object，要解析	
				//如果服务器返回xml，即backDate就是object，要解析	
				var $img = $("<img src='"+backDate+"' width='14px' height='14px'>");
				$("span").text("");
				$("span").append($img);
			});
		});
	</script>
	
  </body>
</html>








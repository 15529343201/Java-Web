<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基于HTML，以GET或POST方式，检查注册用户名是否在数据库中已存在</title>
  </head>
  <body>
	
	<form>
		用户名[GET]：<input id="usernameID" type="text" name="username" maxlength="4"/>
		光标移出后，立即检查结果
	</form>
	<hr/>
	<span id="resID"></span>
	
	<script type="text/javascript">
		//创建AJAX异步对象，即XMLHttpRequest
		function createAJAX(){
			var ajax = null;
			try{
				ajax = new ActiveXObject("microsoft.xmlhttp");
			}catch(e1){
				try{
					ajax = new XMLHttpRequest();
				}catch(e2){
					alert("你的浏览器不支持ajax，请更换浏览器");
				}
			}
			return ajax;
		}
	</script>
	
	
	<script type="text/javascript">
		//定位文本框，同时提供焦点失去事件
		document.getElementById("usernameID").onblur = function(){
			//获取文本框中输入的值
			var username = this.value;
			//如果用户没有填内容
			if(username.length == 0){
				//提示 
				document.getElementById("resID").innerHTML = "用户名必填";
			}else{
				//对汉字进行UTF-8(U8)的编码
				username = encodeURI(username);
				//NO1)
				var ajax = createAJAX();
				//NO2)
				var method = "GET";
				var url = "${pageContext.request.contextPath}/UserServlet?time="+new Date().getTime()+"&username=" + username;
				ajax.open(method,url);
				//NO3)
				ajax.send(null);
				
				//--------------------------------------------------------等待
				
				//NO4)
				ajax.onreadystatechange = function(){
					if(ajax.readyState == 4){
						if(ajax.status == 200){
							//NO5)
							var tip = ajax.responseText;
							//NO6)
							document.getElementById("resID").innerHTML = tip;
						}
					}
				}
			}
		}
	</script>
	
  </body>
</html>







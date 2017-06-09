<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基于HTML，以GET或POST方式，检查注册用户名是否在数据库中已存在</title>
	<!-- 引入外部js文本 -->
    <script type="text/javascript" src="js/ajax.js"></script>
  </head>
  <body>
	
	
	用户名[POST]：<input id="usernameID" type="text" maxlength="4"/>
	<span id="resID">
		<!-- 
		<img src="tip变量" width="12px" height="12px"/>
		-->
	</span>
	
	
	<hr/>

	
	<script type="text/javascript">
		document.getElementById("usernameID").onblur = function(){
			var username = this.value;//杰克
			//NO1)
			var ajax = createAJAX();
			//NO2)
			var method = "POST";
			var url = "${pageContext.request.contextPath}/UserServlet?time="+new Date().getTime();
			ajax.open(method,url);
			//设置AJAX请求头为POST，他会将请求体中的汉字自动进行UTF-8的编码
			ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");
			//NO3)
			var content = "username=" + username;
			ajax.send(content);
			
			
			//===========================================等待
			
			
			//NO4)
			ajax.onreadystatechange = function(){
				if(ajax.readyState == 4){
					if(ajax.status == 200){
						//NO5)
						var tip = ajax.responseText;
					
						//NO6)
						//创建img标签
						var imgElement = document.createElement("img");
						//设置img标签的src/width/height的属性值
						imgElement.src = tip;
						imgElement.style.width = "12px";
						imgElement.style.height = "12px";
						//定位span标签
						var spanElement = document.getElementById("resID");
						//清空span标签中的内容
						spanElement.innerHTML = "";
						//将img标签加入到span标签中
						spanElement.appendChild(imgElement);
					}
				}
			}
		}
	</script>
	
	
	<!-- 
	<form action="" method="" enctype="application/x-www-form-urlencoded"></form>
	-->

  </body>
</html>







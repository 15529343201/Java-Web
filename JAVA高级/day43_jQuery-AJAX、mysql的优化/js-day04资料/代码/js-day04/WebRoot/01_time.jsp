<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>取得服务端当前时间</title>
    <script type="text/javascript" src="js/jquery-1.8.2.js"></script>
  </head>
  <body>
	
	当前时间：<span id="time"></span><br/>
	<input type="button" value="获取时间"/>
	
	
	
	<script type="text/javascript">
		$(":button").click(function(){
			//参数一:发送的路径
			var url = "${pageContext.request.contextPath}/servlet/TimeServlet?time="+new Date().getTime();
			//参数二:以JSON文本书写的发送的参数
			var sendDate = {
				"name" : "哈哈",
				"sal"  :  6000
			};
			//参数三:回调函数
			$("#time").load(url,sendDate,function(backData,textStatus,xmlHttpRequest){
				//回调函数中参数一：backData表示返回的数据，它是js对象
				//回调函数中参数二：textStatus表示返回状态的文本描述，例如：success，error，
				//回调函数中参数三：xmlHttpRequest表示ajax中的核心对象
				//alert("backData=" + backData);//它是一个js对象
				//alert("textStatus=" + textStatus);
				//alert("xmlHttpRequest=" + xmlHttpRequest.readyState);
				//alert("xmlHttpRequest=" + xmlHttpRequest.status);
				//alert("xmlHttpRequest=" + xmlHttpRequest.responseText);//它是一个字符串
				//项目中只需要使用backDate即可				
			});
			
							
			//$("#time").load(url,sendDate);
			//$("#time").load(url);
		});
	</script>
	
  </body>
</html>








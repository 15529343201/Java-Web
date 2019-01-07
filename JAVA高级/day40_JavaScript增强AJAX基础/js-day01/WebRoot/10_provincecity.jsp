<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基于XML，以POST方式，完成省份-城市二级下拉联动</title>
    <script type="text/javascript" src="js/ajax.js"></script>
  </head>
  <body>
		
	<select id="provinceID" style="width:111px">
		<option>选择省份</option>
		<option>湖南</option>
		<option>广东</option>
	</select>	
	&nbsp;&nbsp;&nbsp;
	<select id="cityID" style="width:111px">
		<option>选择城市</option>
	</select>	
	
	<script type="text/javascript">
		//定位省份下拉框，同时添加内容改变事件
		document.getElementById("provinceID").onchange = function(){
			//清空城市下拉框中的内容，除第一项外
			var cityElement = document.getElementById("cityID");
			cityElement.options.length = 1;
			//获取选中option标签的索引号，从0开始			
			var index = this.selectedIndex; 	
			//定位选中的option标签
			var optionElement = this[index];
			//获取选中的option标签中的内容，即省份
			var province = optionElement.innerHTML;
			//如果选中的内容不是"选择省份"
			if("选择省份" != province){
				//NO1)
				var ajax = createAJAX();
				//NO2)
				var method = "POST";
				var url = "${pageContext.request.contextPath}/ProvinceCityServlet?time="+new Date().getTime();
				ajax.open(method,url);
				//设置AJAX请求头
				ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");
				//NO3)
				var content = "province=" + province;
				ajax.send(content);
				
				//---------------------------------等待
				
				//NO4)
				ajax.onreadystatechange = function(){
					if(ajax.readyState == 4){
						if(ajax.status == 200){
							//NO5)从AJAX异步对象中获取服务器响应的xml文档
							var xmlDocument = ajax.responseXML;
							
							//NO6)按照DOM规则，解析XML文档
								
							var cityElementArray = xmlDocument.getElementsByTagName("city");	
							var size = cityElementArray.length;
							for(var i=0;i<size;i++){
								//innerHTML只能用在html/jsp中，不能用在xml中
								var city = cityElementArray[i].firstChild.nodeValue;
								//<option></option>
								var optionElement = document.createElement("option");	
								//<option>广州</option>
								optionElement.innerHTML = city;
								//<select><option>广州</option></select>
								cityElement.appendChild(optionElement);
							}
						}
					}
				}
			}
		}
	</script>
	
  </body>
</html>







<%@ page language="java" import="java.util.*,gz.itcast.contactSys_web.entity.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查询所有联系人</title>
<style type="text/css">
	table td{
		/*文字居中*/
		text-align:center;
	}
	
	/*合并表格的边框*/
	table{
		border-collapse:collapse;
	}
</style>
</head>

<body>
<center><h3>查询所有联系人(jsp版本)</h3></center>
<table align="center" border="1" width="700px">
	<tr>
    	<th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>QQ</th>
        <th>操作</th>
    </tr>
    <%
    	//从request域中接收数据
    	List<Contact> list = (List<Contact>)request.getAttribute("contacts");
    	
    	for(Contact con:list){
     %>
    <tr>
    	<td><%=con.getId() %></td>
        <td><%=con.getName() %></td>
        <td><%=con.getGender() %></td>
        <td><%=con.getAge() %></td>
        <td><%=con.getPhone() %></td>
        <td><%=con.getEmail() %></td>
        <td><%=con.getQq() %></td>
        <td><a href="修改联系人.html">修改</a>&nbsp;<a href="查询所有联系人.html">删除</a></td>
    </tr>
    <%
    	}
     %>
    <tr>
    	<td colspan="8" align="center"><a href="添加联系人.html">[添加联系人]</a></td>
    </tr>
</table>
</body>
</html>


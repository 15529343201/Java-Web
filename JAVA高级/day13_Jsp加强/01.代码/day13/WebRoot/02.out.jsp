<%@ page language="java" import="java.util.*" pageEncoding="utf-8" buffer="1kb"%><%
		for(int i=1;i<=1024;i++){
    		out.write("a");
    	}
    	//查看缓存区大小
    	System.out.println("当前缓存区大小："+out.getBufferSize());
    	//查看缓存区剩余大小
    	System.out.println("缓存区剩余大小："+out.getRemaining());
    	//刷新缓存
    	//out.flush();
    	response.getWriter().write("123");
     %>
  </body>
</html>

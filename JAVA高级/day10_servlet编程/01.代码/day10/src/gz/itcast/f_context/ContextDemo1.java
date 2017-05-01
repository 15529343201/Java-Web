package gz.itcast.f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 得到web应用路径
 * @author APPle
 *
 */
public class ContextDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.得到ServletContext对象
		//ServletContext context = this.getServletConfig().getServletContext();
		ServletContext context = this.getServletContext(); //（推荐使用）
		
		
		//2.得到web应用路径  /day10
		/**
		 * web应用路径：部署到tomcat服务器上运行的web应用名称
		 */
		String contextPath = context.getContextPath();
		
		System.out.println(contextPath);
		
		
		/**
		 * 案例：应用到请求重定向
		 */
		response.sendRedirect(contextPath+"/index.html");
	}

}

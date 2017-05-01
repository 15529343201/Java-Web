package gz.itcast.g_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 转发（效果：跳转页面）
 * @author APPle
 *
 */
public class ForwardDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/**
		 * 保存数据到request域对象
		 */
		request.setAttribute("name", "rose");
		
		
		//转发	
		/**
		 * 注意：不能转发当前web应用以外的资源。
		 */
		/*RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/GetDataServlet");
		rd.forward(request, response);*/
		this.getServletContext().getRequestDispatcher("/GetDateServlet").forward(request, response);
	}

}

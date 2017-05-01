package gz.itcast.f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 获取数据
 * @author APPle
 *
 */
public class ContextDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.得到域对象
		ServletContext context = this.getServletContext();
		
		//2.从域对象中取出数据
		//String name = (String)context.getAttribute("name");
		Student student = (Student)context.getAttribute("student");
		//System.out.println("name="+name);
		
		System.out.println(student);
	}

}

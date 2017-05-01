package gz.itcast.c_life;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LifeDemo extends HttpServlet {

	/**
	 * 1.构造方法
	 */
	public LifeDemo(){
		System.out.println("1.servlet对象被创建了。");
	}

	/**
	 * 2.init方法
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("2.init方法被调用");
	}
	
	/**
	 * 3.service方法
	 */
	@Override			
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("3.service方法被调用");
	}
	
	/**
	 * 4.destroy方法
	 */
	@Override
	public void destroy() {
		System.out.println("4.servlet对象销毁了");
	}
	
	
}

package gz.itcast.b_resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 读取web应用下的资源文件（例如properties）
 * @author APPle
 */
public class ResourceDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 *  . 代表java命令运行目录。java运行命令在哪里？？ 在tomcat/bin目录下
		 *   结论： 在web项目中， . 代表在tomcat/bin目录下开始，所以不能使用这种相对路径。
		 */
		
		
		//读取文件。在web项目下不要这样读取。因为.表示在tomcat/bin目录下
		/*File file = new File("./src/db.properties");
		FileInputStream in = new FileInputStream(file);*/
		
		/**
		 * 使用web应用下加载资源文件的方法
		 */
		/**
		 * 1. getRealPath读取,返回资源文件的绝对路径
		 */
		/*String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		System.out.println(path);
		File file = new File(path);
		FileInputStream in = new FileInputStream(file);*/
		
		/**
		 * 2. getResourceAsStream() 得到资源文件，返回的是输入流
		 */
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		
		
		Properties prop = new Properties();
		//读取资源文件
		prop.load(in);
		
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		System.out.println("user="+user);
		System.out.println("password="+password);
		
	}

}

package gz.itcast.c_cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 第一个cookie的程序
 * @author APPle
 *
 */
public class CookieDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.创建Cookie对象
		Cookie cookie1 = new Cookie("name","eric");
		//Cookie cookie2 = new Cookie("email","jacky@qq.com");
		//Cookie cookie1 = new Cookie("email","eric@qq.com");
		
		
		/**
		 * 1）设置cookie的有效路径。默认情况：有效路径在当前web应用下。 /day11
		 */
		//cookie1.setPath("/day11");
		//cookie2.setPath("/day12");
		
		/**
		 * 2)设置cookie的有效时间
		 * 正整数：表示cookie数据保存浏览器的缓存目录（硬盘中），数值表示保存的时间。
			负整数：表示cookie数据保存浏览器的内存中。浏览器关闭cookie就丢失了！！
			零：表示删除同名的cookie数据

		 */
		//cookie1.setMaxAge(20); //20秒，从最后不调用cookie开始计算
		cookie1.setMaxAge(-1); //cookie保存在浏览器内存（会话cookie）
		//cookie1.setMaxAge(0);
		
		
		//2.把cookie数据发送到浏览器（通过响应头发送： set-cookie名称）
		//response.setHeader("set-cookie", cookie.getName()+"="+cookie.getValue()+",email=eric@qq.com");
		//推荐使用这种方法，避免手动发送cookie信息
		response.addCookie(cookie1);
		//response.addCookie(cookie2);
		//response.addCookie(cookie1);
		

		
		//3.接收浏览器发送的cookie信息
		/*String name = request.getHeader("cookie");
		System.out.println(name);*/
		Cookie[] cookies = request.getCookies();
		//注意：判断null,否则空指针
		if(cookies!=null){
			//遍历
			for(Cookie c:cookies){
				String name = c.getName();
				String value = c.getValue();
				System.out.println(name+"="+value);
			}
		}else{
			System.out.println("没有接收cookie数据");
		}
		
	}

}

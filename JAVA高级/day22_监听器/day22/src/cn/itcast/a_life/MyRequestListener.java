package cn.itcast.a_life;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *  监听request对象的创建或销毁
 * @author Jie.Yuan
 *
 */
public class MyRequestListener implements ServletRequestListener{

	// 对象销毁
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// 获取request中存放的数据
		Object obj = sre.getServletRequest().getAttribute("cn");
		System.out.println(obj);
		System.out.println("MyRequestListener.requestDestroyed()");
	}

	// 对象创建
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("MyRequestListener.requestInitialized()");
	}
}

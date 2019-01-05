package cn.itcast.f_aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	ApplicationContext ac = 
		new ClassPathXmlApplicationContext("cn/itcast/f_aop_xml/bean.xml");

	// 目标对象有实现接口，spring会自动选择“JDK代理”
	@Test
	public void testApp() {
		IUserDao userDao = (IUserDao) ac.getBean("userDao");
		System.out.println(userDao.getClass());//$Proxy001  
		userDao.save();
	}
	/*
	 * class cn.itcast.f_aop_xml.OrderDao$$EnhancerByCGLIB$$9a990971
		环绕前....
		开始事务/异常
		-----核心业务：保存！！！------
		环绕后....
		提交事务/关闭
		afterReturning()
	 */
	
	// 目标对象没有实现接口， spring会用“cglib代理”
	@Test
	public void testCglib() {
		OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
		System.out.println(orderDao.getClass());
		orderDao.save();
	}
	/*
	 * class cn.itcast.f_aop_xml.OrderDao$$EnhancerByCGLIB$$c1fb0631
		环绕前....
		开始事务/异常
		-----核心业务：保存！！！------
		环绕后....
		提交事务/关闭
		afterReturning()
	 */
}

















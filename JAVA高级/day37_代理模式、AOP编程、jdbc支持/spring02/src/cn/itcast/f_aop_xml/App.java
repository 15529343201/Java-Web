package cn.itcast.f_aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	ApplicationContext ac = 
		new ClassPathXmlApplicationContext("cn/itcast/f_aop_xml/bean.xml");

	// Ŀ�������ʵ�ֽӿڣ�spring���Զ�ѡ��JDK����
	@Test
	public void testApp() {
		IUserDao userDao = (IUserDao) ac.getBean("userDao");
		System.out.println(userDao.getClass());//$Proxy001  
		userDao.save();
	}
	/*
	 * class cn.itcast.f_aop_xml.OrderDao$$EnhancerByCGLIB$$9a990971
		����ǰ....
		��ʼ����/�쳣
		-----����ҵ�񣺱��棡����------
		���ƺ�....
		�ύ����/�ر�
		afterReturning()
	 */
	
	// Ŀ�����û��ʵ�ֽӿڣ� spring���á�cglib����
	@Test
	public void testCglib() {
		OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
		System.out.println(orderDao.getClass());
		orderDao.save();
	}
	/*
	 * class cn.itcast.f_aop_xml.OrderDao$$EnhancerByCGLIB$$c1fb0631
		����ǰ....
		��ʼ����/�쳣
		-----����ҵ�񣺱��棡����------
		���ƺ�....
		�ύ����/�ر�
		afterReturning()
	 */
}

















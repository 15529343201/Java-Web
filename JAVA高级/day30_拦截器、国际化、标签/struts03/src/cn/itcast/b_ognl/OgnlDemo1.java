package cn.itcast.b_ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import org.junit.Test;

// OgnlContext用法
public class OgnlDemo1 {

	/**
	 * 1. Ognl表达式语言语言取值，取非根元素的值，必须用#号
	 * @throws Exception
	 */
	@Test
	public void testOgnl() throws Exception {
		// 创建一个Ognl上下文对象
		OgnlContext context = new OgnlContext();
		// 放入数据
		User user = new User();
		user.setId(100);
		user.setName("Jack");
		// 【往非根元素放入数据， 取值的时候表达式要用"#"】
		context.put("user", user);
		
		// 获取数据(map)
		// 先构建一个Ognl表达式, 再解析表达式
		Object ognl = Ognl.parseExpression("#user.name");
		Object value = Ognl.getValue(ognl, context, context.getRoot());
		
		System.out.println(value);
	}
	
	/**
	 * 2. Ognl表达式语言语言取值，取根元素的值，不用带#号
	 * @throws Exception
	 */
	@Test
	public void testOgn2() throws Exception {
		// 创建一个Ognl上下文对象
		OgnlContext context = new OgnlContext();
		// 放入数据
		User user = new User();
		user.setId(100);
		user.setName("Jack");
		// 【往根元素放入数据】
		context.setRoot(user);
		
		// 获取数据(map)
		// 先构建一个Ognl表达式, 再解析表达式
		Object ognl = Ognl.parseExpression("address.province");
		Object value = Ognl.getValue(ognl, context, context.getRoot());
		
		System.out.println(value);
	}
	
	/**
	 * 3.Ognl对 静态方法调用的支持
	 * @throws Exception
	 */
	@Test
	public void testOgn3() throws Exception {
		// 创建一个Ognl上下文对象
		OgnlContext context = new OgnlContext();
		
		// Ognl表单式语言，调用类的静态方法
		//Object ognl = Ognl.parseExpression("@Math@floor(10.9)");
		// 由于Math类在开发中比较常用，所以也可以这样写
		Object ognl = Ognl.parseExpression("@@floor(10.9)");
		Object value = Ognl.getValue(ognl, context, context.getRoot());
		System.out.println(value);
	}
}






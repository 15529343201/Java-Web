package cn.itcast.a_generic;

import org.junit.Test;

/**
 * 泛型方法/泛型类
 * @author Jie.Yuan
 *
 */
public class GenericDemo<T> {

	// 定义泛型方法
	public <K> T save(T t,K k) {
		return null;
	}
	
	public void update(T t) {

	}
	
	// 测试方法
	@Test
	public void testMethod() throws Exception {
		
		// 泛型类：  在创建爱泛型类对象的时候，确定类型
		GenericDemo<String> demo = new GenericDemo<String>();
		demo.save("test", 1);
	}
}

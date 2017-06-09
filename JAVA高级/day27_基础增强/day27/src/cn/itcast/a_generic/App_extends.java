package cn.itcast.a_generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 泛型, 涉及到一些关键字
 * 
 * Ctrl + shift + R   查看当前项目中类
 * Ctrl + shift + T   查看源码jar包中的类
 * @author Jie.Yuan
 *
 */
public class App_extends {
	
	
	/**
	 * list集合只能处理 Double/Float/Integer等类型
	 * 限定元素范围：元素的类型要继承自Number类  (上限)
	 * @param list
	 */
	public void save(List<? extends Number> list) {
	}

	@Test
	public void testGeneric() throws Exception {
		List<Double> list_1 = new ArrayList<Double>();
		List<Float> list_2 = new ArrayList<Float>();
		List<Integer> list_3 = new ArrayList<Integer>();
		
		List<String> list_4 = new ArrayList<String>();
		
		// 调用
		save(list_1);
		save(list_2);
		save(list_3);
		//save(list_4);
	}
}













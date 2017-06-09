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
public class App_super {
	
	
	/**
	 * super限定元素范围：必须是String父类   【下限】
	 * @param list
	 */
	public void save(List<? super String> list) {
	}

	@Test
	public void testGeneric() throws Exception {
		// 调用上面方法，必须传入String的父类
		List<Object> list1 = new ArrayList<Object>();
		List<String> list2 = new ArrayList<String>();
		
		List<Integer> list3 = new ArrayList<Integer>();
		//save(list3);
	}
}













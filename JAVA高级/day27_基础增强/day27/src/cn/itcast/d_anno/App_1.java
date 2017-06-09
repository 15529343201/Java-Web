package cn.itcast.d_anno;

import java.util.List;

import org.junit.Test;

/**
 * 常用的注解
 * @author Jie.Yuan
 *
 */
public class App_1 {

	// 重写父类的方法
	@Override
	public String toString() {
		return super.toString();
	}
	
	// 抑制编译器警告
	@SuppressWarnings(value = {"unused","unchecked"})
	private void save() {
		List list = null;
	}
	
	// 标记方法以及过时
	@Deprecated
	private void save1() {
	}
	
	
	@Test
	public void testMain() throws Exception {
	}
}

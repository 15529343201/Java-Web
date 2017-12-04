package cn.itcast.d_debug;

import org.junit.Test;

/**
 * 1. 为什么用调试？
 * 	——————> 解决错误。   程序运行很快，看不到哪里可能出现问题，希望程序在指定位置停止下来，
 *  ——————> 以便于观察变量值的变化
 * 
 * 2. 设置断点：  设置断点的每一个地方，程序都会停止下来!
 *    要选择debug模式运行程序
 * 3. 操作
 * 	   F5  step into  单步进入  （跳入方法）
 *     F6  step over  单步跳过
 *     F7  step return 跳出方法
 *     F8  resume     结束调试运行程序，或者跳入下一个断点
 *
 * 4. web项目报错
 *  ----> 访问提交的servlet的第一行，设置断点，调试！
 */
public class App {
	int r;

	@Test
	public void testApp() throws Exception {
		Cal cal = new Cal();
		int sum = cal.sum(1,13,2);
		System.out.println("和:" + sum);
	}
	
	
	public static void main(String[] args) {
		
	}
}

package cn.itcast.review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 匿名对象： 没有引用类型变量指向的对象就称作为匿名对象。
 
匿名对象的主要作用： 简化书写。

匿名对象主要用于两种应用场景：
	1. 如果一个对象的方法只会调用一次的时候，然后该对象就不再使用了，这时候就就可以使用匿名对象。
 	2. 作为参数传递。
 */
public class Demo7 {
	
	public static void main(String[] args) throws IOException {
		// Runtime runtime = Runtime.getRuntime();
//		Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
		
//		FileReader fileReader = new FileReader("F:\\a.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\a.txt"));
	
	}
	
}

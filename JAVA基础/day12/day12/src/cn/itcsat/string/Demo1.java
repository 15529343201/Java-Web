package cn.itcsat.string;
/*
 String 字符串类:
  
 笔试题目：new String("abc")创建了几个对象？
  两个对象， 一个对象是 位于字符串常量池中，一个对象是位于堆内存中。
  
  
  
  
 */


public class Demo1 {
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1==str2?"+(str1==str2));  // true  
		System.out.println("str2==str3?"+(str2==str3));  //false
		System.out.println("str3==str4?"+(str3==str4));  // false
		System.out.println("str3.equals(str2)?"+(str3.equals(str4))); //true
		//是String类重写了Object的equals方法，比较的是两个字符串对象 的内容 是否一致。
		// "=="用于比较 引用数据类型数据的时候比较的是两个对象 的内存地址，equals方法默认情况下比较也是两个对象 的内存地址。
		
		test(null);
	}
	
	public static void test(String str){
		if("中国".equals(str))
		{
			System.out.println("回答正确");
		}else{
			System.out.println("回答错误");
		}
	}
	
}

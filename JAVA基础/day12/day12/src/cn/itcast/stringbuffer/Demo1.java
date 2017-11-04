package cn.itcast.stringbuffer;
/*
 字符串特点：字符串是常量；它们的值在创建之后不能更改.
 
 字符串的内容一旦发生了变化，那么马上会创建一个新 的对象。
 
 注意： 字符串的内容不适宜频繁修改，因为一旦修改马上就会创建一个新的对象。
 
 如果需要频繁修改字符串 的内容，建议使用字符串缓冲 类（StringBuffer）。
 
 
 StringBuffer 其实就是一个存储字符 的容器。
 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String str1 = "hello";
		String str2	= str1+" world";
		System.out.println("str1与str2是同一个 对象吗？"+(str1==str2));
		
		
	}

}

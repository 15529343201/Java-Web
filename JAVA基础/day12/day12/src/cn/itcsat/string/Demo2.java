package cn.itcsat.string;
/*
 String 的构造方法：
 
 	String()  创建一个空内容 的字符串对象。
 	String(byte[] bytes)  使用一个字节数组构建一个字符串对象
 	String(byte[] bytes, int offset, int length) 
 		bytes :  要解码的数组
 		offset： 指定从数组中那个索引值开始解码。
 		length：　要解码多个元素。
 	
 	String(char[] value)  使用一个字符数组构建一个字符串。	
 	String(char[] value, int offset, int count)  使用一个字符数组构建一个字符串， 指定开始的索引值，与使用字符个数。
	String(int[] codePoints,int offset,int count)
	String(String original) 

记住： 使用字节数组或者字符数组都可以构建一个字符串对象。


 */
public class Demo2 {
	
	public static void main(String[] args) {
		String str = new String();
		byte[] buf = {97,98,99};
		
		str = new String(buf); //使用一个字节数组构建一个字符串对象
		str = new String(buf,1,2);   //使用一个字节数组构建一个字符串对象,指定开始解码 的索引值和解码的个数。
		
		char[] arr = {'明','天','是','圣','诞'};
		str = new String(arr); //使用字符数组构建一个字符串
		str = new String(arr,3,2);
		
		int[] 	buf2 = {65,66,67};
		str = new String(buf2,0,3);
		
		str = new String("abc");
		
		
		System.out.println("字符串的内容："+str);
		
		
		
		
	}
	
}

package cn.itcast.other;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
编码与解码 
 
 编码： 把看得懂的字符变成看不懂码值这个过程我们称作为编码。
 
解码： 把码值查找对应的字符，我们把这个过程称作为解码。

注意： 以后编码与解码一般我们都使用统一的码表。否则非常容易出乱码。

 */

public class Demo7 {
	
	public static void main(String[] args) throws Exception {
		/*
		String str = "中国";
		byte[] buf = str.getBytes("utf-8");// 平台默认的编码表是gbk编码表。  编码
		System.out.println("数组的元素："+Arrays.toString(buf)); //
		
		str = new String(buf,"utf-8");  //默认使用了gbk码表去解码。 
		System.out.println("解码后的字符串："+ str);		
		*/
		
		
		/*String str = "a中国"; // ,0, 97, 78, 45, 86, -3
		byte[] buf = str.getBytes("unicode");  //编码与解码的时候指定 的码表是unicode实际上就是用了utf-16.
		System.out.println("数组的内容："+ Arrays.toString(buf));
		*/
		
		
		String str = "大家好";
		byte[] buf = str.getBytes(); //使用gbk进行编码
		System.out.println("字节数组："+ Arrays.toString(buf));  // -76, -13, -68, -46, -70, -61
		
		str = new String(buf,"iso8859-1");
		// 出现乱码之后都可以被还原吗？ 
		
		byte[] buf2 = str.getBytes("iso8859-1");
		str = new String(buf2,"gbk"); 

		System.out.println(str);
		
		
		
		
	}
	
}

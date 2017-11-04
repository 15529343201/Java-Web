package cn.itcsat.string;

import java.util.Arrays;

/*
 其他方法
	String replace(String oldChar, String newChar) 替换
	String[] split(String regex) 切割
	
	String substring(int beginIndex)   指定开始 的索引值截取子串
	String substring(int beginIndex, int endIndex)指定开始 与结束的索引值截取子串
	
	String toUpperCase() 转大写
	String toLowerCase() 转小写
	String trim() 去除字符串首尾的空格
	


	
*/

public class Demo5 {
	
	public static void main(String[] args) {
		String str = "今天晚上不考试";
		System.out.println("指定新内容替换旧 的内容:"+ str.replace("不", "要好好"));
		str = "大家-下-午-好";
		String[] arr = str.split("-"); //根据指定的字符进行切割 。
		System.out.println("字符串数组的内容："+ Arrays.toString(arr));
		str = "广州传智播客";
		System.out.println("指定开始的索引值截取子串:"+ str.substring(2));
		System.out.println("指定开始的索引值截取子串:"+ str.substring(2,6)); //包头不包尾  注意：截取的内容是包括开始的索引值，不包括结束的索引值， 截取的位置是结束的索引值-1.
		
		str = "abC中国";
		System.out.println("转大写：" + str.toUpperCase());
		str = "AbdfSDD"; 
		System.out.println("转小写："+ str.toLowerCase());
		
		str = "         大家最近        都非常努力            ";
		System.out.println("去除字符串首尾的空格："+ str.trim());
		
		
	}
	
	


}

package cn.itcsat.string;
/*
2.2	获取方法
	int length()  获取字符串的长度
	char charAt(int index) 获取特定位置的字符 (角标越界)
	int indexOf(String str) 查找子串第一次出现的索引值,如果子串没有出现 在字符串中，那么则返回-1表示。
	int lastIndexOf(String str) 查找子串最后一次出现的索引值 , 如果子串没有出现 在字符串中，那么则返回-1表示
*/

public class Demo3 {
	
	public static void main(String[] args) {
		String str = "abc中国ab中国";
		System.out.println("字符串的字符 个数: " + str.length() );
		System.out.println("根据索引值获取对应 的字符:"+ str.charAt(3));
		System.out.println("查找子串第一次出现的索引值：" + str.indexOf("中国"));
		System.out.println("查找子串最后一次出现的索引值：" + str.lastIndexOf("中国"));
		
	}
	

}

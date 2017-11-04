package cn.itcast.review;

import java.util.Scanner;
import java.util.TreeMap;

/*
从键盘输入一个字母组成字符串，分别统计每个字母出现的次数(10分)
要求输出的效果按照字母的顺序输出  a(7)b(5)...
*/
public class Demo16 {

	public static void main(String[] args) {
		System.out.println("请输入一段字符串：");
		Scanner  scanner = new Scanner(System.in);
		String line = scanner.next();
		char[] arr = line.toCharArray();	//先把字符串转换成字符数组。
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(); 
		for(char c : arr){
			if(map.containsKey(c)){ //map集合已经包含了该字符
				int count = map.get(c);
				map.put(c, count+1);
			}else{  //没有包含
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		
	}
	
}

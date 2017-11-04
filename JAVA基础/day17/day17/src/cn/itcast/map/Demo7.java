package cn.itcast.map;

import java.util.Date;
import java.util.TreeMap;

/*
需求： 定义一个TreeMap，键存储的是书对象，值存储的是字符串。 根据书的出版出版日期排序。

 */
class Book{
	
	String name;
	
	String date; //出版日期	
}

public class Demo7 {
	
	public static void main(String[] args) {
		TreeMap<Book, String>  map = new TreeMap<Book, String>();  //值存储书名
		Date date = new Date();
		
		
	}

}

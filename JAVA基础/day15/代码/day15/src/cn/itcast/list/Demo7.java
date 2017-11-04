package cn.itcast.list;

import java.util.ArrayList;
import java.util.Iterator;

/*

*/
class Book{
	
	int id;
	
	String name;// 名字

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ 书号："+ this.id+" 书名："+ this.name+" }";
	
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book =(Book)obj;
		return this.id==book.id;
	}
	
	
}

// 需求： 编写一个函数清除集合中重复元素。 如果书号是一样就视为重复元素。  要求： 遍历集合元素的时候必须使用迭代器。  get 迭代器

public class Demo7 {
	
	public static void main(String[] args) {
		ArrayList list=  new ArrayList();
		list.add(new Book(110,"java编程思想"));
		list.add(new Book(220,"java核心技术"));
		list.add(new Book(330,"深入javaweb"));
		list.add(new Book(110,"javas神书"));
		
		ArrayList list2 = clearRepeat(list);
		System.out.println("新集合的元素是："+ list2);
	}
	
	
	public static ArrayList  clearRepeat(ArrayList list){
		//创建一个新的集合
		ArrayList newList = new ArrayList();
		//获取迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();  //从旧集合中获取的元素
			if(!newList.contains(book)){
				//如果新集合没有包含该书籍，那么就存储到新集合中
				newList.add(book);
			}
		}
		return newList;
		
	}
	
	
}

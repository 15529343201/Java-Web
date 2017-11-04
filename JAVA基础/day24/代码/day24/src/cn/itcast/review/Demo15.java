package cn.itcast.review;

import java.util.HashSet;
import java.util.Iterator;

/*
 
集合

单例集合
----------| Collection 单列集合的根接口
----------------| List 如果是实现了List接口集合类具备的特点： 有序，可重复。
-------------------| ArrayList   底层使用Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList  底层是使用了链表数据数据结构实现的。 特点： 查询慢，增删快。
-------------------| Vector(了解)   底层使用Object数组实现的， 实现与ArrayList是一样，只不过是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口集合类具备的特点： 无序，不可重复。
------------------| HashSet  底层使用的是哈希表实现的。  
------------------| TreeSet  底层使用二叉数实现。 

双列集合：
--------| Map  (只需要把Map接口的方法全部练习一次即可。)
-----------| HashMap  底层使用的是哈希表实现的。  
-----------| TreeMap   底层使用二叉数实现
-----------| HashTable（了解）

 */
class Book{
	
	String name;
	
	double price;

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b  = (Book)obj;
		return this.name.equals(b.name);
	}
	
	
	@Override
	public String toString() {
		return "[书名："+ this.name+" 价格："+this.price+"]";
	}
}

public class Demo15 {
	
	public static void main(String[] args) {
		//不允许重复的书名存在。
		HashSet<Book> books = new HashSet<Book>();
		books.add(new Book("深入javaweb",34));
		books.add(new Book("java神书",78));
	
		//修改书名
		Iterator<Book> it = books.iterator();
		while(it.hasNext()){
			Book b = it.next();
			if(b.name.equals("java神书")){
				b.name = "java编程思想";
			}
		}
		
		//为什么修改名字之后不能删除了呢?
		books.remove(new Book("java神书",78));
		
		System.out.println("集合的元素："+ books);
		
		
		
		
	}
	
}

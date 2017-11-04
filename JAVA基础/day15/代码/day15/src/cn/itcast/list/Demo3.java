package cn.itcast.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
迭代
	listIterator() 
	

ListIterator特有的方法：
	
	添加：
		hasPrevious()  判断是否存在上一个元素。
		previous()    当前指针先向上移动一个单位，然后再取出当前指针指向的元素。
		
		next();  先取出当前指针指向的元素，然后指针向下移动一个单位。
		
---------------------------	
	
		add(E e)   把当前有元素插入到当前指针指向的位置上。
		set(E e)   替换迭代器最后一次返回的元素。
		
	
*/
public class Demo3 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		list.add("美美");
		
		ListIterator it = list.listIterator(); //返回的是一个List接口中特有的迭代器
		/*System.out.println("有上一个元素吗？"+ it.hasPrevious());
		System.out.println("获取上一个元素："+it.previous());
		it.next();
		System.out.println("获取上一个元素："+ it.previous());
		
		
		while(it.hasNext()){
			it.next();
		}
		
		while(it.hasPrevious()){
			System.out.println("元素："+ it.previous());
		}
		
		
		it.next();
		it.next();
		it.add("张三");
		*/
		it.next();
		it.next();
		it.set("张三");
		
		
		System.out.println("集合的元素："+ list);
		
		
	}

}

package cn.itcast.list;

import java.util.ArrayList;
import java.util.List;


/*
List接口中特有方法：
	添加
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	获取：
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
		
	修改：
		set(int index, E element) 
	
List接口中特有的方法具备的特点： 操作的方法都存在索引值。	

只有List接口下面的集合类才具备索引值。其他接口下面的集合类都没有索引值。
	
	
		
ctrl + shift + /  添加多行注释

ctrl  + shift + \  取消多行注释.
*/
public class Demo2 {
	
	public static void main(String[] args) {
		List list=  new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");  //把元素添加到集合的末尾处。
		list.add("狗娃");
		
		/*	
	       //添加方法
		list.add(1, "赵本山"); // 把元素添加到集合中的指定索引值位置上。
		List list2 = new ArrayList();
		list2.add("本山");
		list2.add("小沈阳");
		list.addAll(2,list2); //把list2的元素添加到list集合指定索引值的位置上。
		 */
		
		/*
//		获取的方法 
		System.out.println("get方法获取元素："+list.get(1)); //根据索引值获取集合中的元素
		使用get方法遍历集合的元素：
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("找出指定元素第一次出现在集合中 的索引值："+ list.indexOf("本山"));
		System.out.println("找指定的元素最后一次出现在集合中的索引值："+list.lastIndexOf("狗娃"));
		List subList = list.subList(1, 3); //指定开始与结束的索引值截取集合中的元素。
		System.out.println("子集合的元素是："+ subList);
	 */	
		list.set(3, "赵本山"); //使用指定的元素替换指定索引值位置的元素。
		
		
		System.out.println("集合的元素："+list);
		
		
		
		
	}

}

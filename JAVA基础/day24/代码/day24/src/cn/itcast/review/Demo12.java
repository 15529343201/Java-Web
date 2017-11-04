package cn.itcast.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 多态： 父类的引用类型变量指向了子类的对象，或者是接口的引用类型变量指向接口实现类的对象。 
 
应用： 
	1. 多态应用于形参类型的时候，可以接收更多类型的参数，
		sort(List  list)
		sort(ArrayList list)
		sort(LinkedList list)
		 
	2. 多态用于返回值类型的时候可以返回更多类型的参数。

迭代器的作用： 用于获取集合中的元素。 	
	
 内部类： 
 
内部类的好处： 内部类可以直接访问外部类的成员。
 
 */

interface MyList{
	
	List subList(int fromIndex, int toIndex);
}






public class Demo12 {
	
	public static void main(String[] args) {
		/*Collections.sort(new ArrayList());
		Collections.sort(new LinkedList());*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(19);
		list.add(12);
		list.add(6);
		
		Iterable<Integer> it = (Iterable<Integer>) list.iterator();
		
		List<Integer> list2 = list.subList(1, 3);
		
		
	}

}

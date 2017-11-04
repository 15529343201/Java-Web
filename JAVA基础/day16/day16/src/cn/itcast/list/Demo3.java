package cn.itcast.list;

import java.util.LinkedList;


class Person{
	
	String name;
	
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override 
	public String toString() {
		return "{ 名字："+ this.name+" 年龄："+ this.age+"}";
	}
	
}


public class Demo3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("狗娃", 7));
		list.add(new Person("狗剩", 17));
		list.add(new Person("铁蛋", 3));
		list.add(new Person("美美", 30));
		
		//编写一个函数根据人的年龄及逆行排序存储。
		for(int i= 0 ; i<list.size() -1 ; i++){
			for(int j = i+1 ; j<list.size() ; j++){
				//符合条件交换位置
				Person p1 = (Person) list.get(i);
				Person p2 = (Person) list.get(j);
				if(p1.age>p2.age){
					//交换位置
					list.set(i, p2);
					list.set(j, p1);
					
				}
			}
		}
		System.out.println(list);
		
		
		
	}
	
	
}

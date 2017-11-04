package cn.itcast.list;

import java.util.LinkedList;

/*
1：栈 （1.6）  : 主要是用于实现堆栈数据结构的存储方式。
	先进后出
	push() 
	pop()
2：队列（双端队列1.5）： 主要是为了让你们可以使用LinkedList模拟队列数据结构的存储方式。
	先进先出
	offer()
	poll()
	
机试题目： 使用LinkedList实现堆栈数据结构的存储方式与队列的数据结构存储方式。	
*/

// 使用LinkedList模拟堆栈的数据结构存储方式
class StackList{
	
	LinkedList list;
	
	public StackList(){
		list = new LinkedList();
	}
	
	//进栈
	public void add(Object o){
		list.push(o);
	}
	
	//弹栈 : 把元素删除并返回。
	public Object pop(){
		return list.pop();
	} 
	
	//获取元素个数
	public int size(){
		return list.size();
	}
	
}

//使用LinkedList模拟队列的存储方式
class TeamList{
	
	LinkedList list;
	
	public TeamList(){
		list = new LinkedList();
	}
	
	public void add(Object o){
		list.offer(o);
	}
	
	public Object remove(){
		return list.poll();
	}
	
	//获取元素个数
	public int size(){
		return list.size();
	}
	
}



public class Demo9 {
	
	public static void main(String[] args) {
		TeamList list=  new TeamList();
		list.add("李嘉诚");
		list.add("马云");
		list.add("王健林");
		
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.remove());
		}
		
		
	}
}

package cn.itcast.review;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 抽象类的应用场景：描述一类事物的时候，如果该类确实存在某种行为，但是目前这种行为的是不具体的
 这时候就可以把这种行为描述成抽象 的行为，这时候使用抽象。
 
抽象类在现实开发中的应用场景：
 
父类私有的成员不能被继承。 
 
继承的问题： 隐式继承。 
 
 */

//工作
class Worker{
	
	private String name;
	
	public void setInfo(String name){
		this.name = name;
		System.out.println("姓名："+ this.name);
	}
	
}

class Teacher extends Worker{
	
}

public class Demo11 {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		//t.name ="狗娃";
		t.setInfo("老钟");
		
	}

}

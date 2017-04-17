package day07;

/*
static(静态\修饰符)

	1. static修饰成员变量 ：如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰。
		
		静态成员变量的访问方式：
				
				方式1： 可以使用对象进行访问。
					格式： 对象.变量名。
				
				方式二： 可以使用类名进行访问。
					格式： 类名.变量名;
	
			注意： 
				1. 非静态的成员变量只能使用对象进行访问，不能使用类名进行访问。
				2. 千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量的数据是真正需要被共享的时候
				才使用static修饰。
			
		static修饰成员变量的应用场景： 如果一个数据需要被所有对象共享使用的时候，这时候即可好实用static修饰。


	2. static修饰成员函数:

*/

class Student{

	static	String name;  //非静态成员变量
	
	static	String  country  = "中国";	  //静态的成员变量
	
	public Student(String name){
		this.name = name;
	}
}


class Demo10 {


	public static void main(String[] args) 
	{
		Student s1 = new Student("狗娃");
		Student s2 = new Student("狗剩");
		
		//System.out.println("国籍："+ Student.country);
		System.out.println("名字："+ s1.name);
		System.out.println("名字："+ s2.name);
	}
}


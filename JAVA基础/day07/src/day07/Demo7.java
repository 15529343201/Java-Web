package day07;

/*
this关键字调用其他的构造函数要注意的事项：
	1. this关键字调用其他的构造函数时，this关键字必须要位于构造函数中 的第一个语句。
	2. this关键字在构造函数中不能出现相互调用 的情况，因为是一个死循环。

*/
class Student{

	int id;  //身份证

	String name;  //名字

	//目前情况：存在同名 的成员 变量与局部变量，在方法内部默认是使用局部变量的。
	public Student(int id,String name){  //一个函数的形式参数也是属于局部变量。
		this(name); //调用了本类的一个参数的构造方法
		//this(); //调用了本类无参的 构造方法。
		this.id = id; // this.id = id 局部变量的id给成员变量的id赋值
		System.out.println("两个参数的构造方法被调用了...");
	}
	
	
	public Student(){
		System.out.println("无参的构造方法被调用了...");
	}

	public Student(String name){
		this.name = name;
		System.out.println("一个参数的构造方法被调用了...");
	}

}


class Demo7 
{
	public static void main(String[] args) 
	{
		Student s = new Student(110,"铁蛋");
		System.out.println("编号："+ s.id +" 名字：" + s.name);
/*
	
		Student s2 = new Student("金胖子");
		System.out.println("名字：" + s2.name);
	*/
	}
}
/*
一个参数的构造方法被调用了...
两个参数的构造方法被调用了...
编号：110 名字：铁蛋
*/
package day07;

/*
static(静态)

需求：描述一下传智学生类。  都是中国人....


目前存在的问题： 所有的学生都是中国 的，有n个学生就会有n份中国的 数据存内存中，这样子
会浪费内存。

目前方案： 把“中国”这个数据移动 到数据共享区中，共享这个数据给所有的Student对象使用即可。

问题2： 如何才能把这个数据移动 到数据共享区中共享呢？

解决方案： 只需要使用static修饰该数据即可。


静态的成员变量只会在数据共享区中维护一份，而非静态成员变量的数据会在每个对象中都维护一份的。。

*/

class Student{

	String name;
	
	//使用了static修饰country，那么这时候country就是一个共享的数据。

	static	String  country  = "中国";	//国籍
	
	//构造函数
	public Student(String name){
		this.name = name;
	}
}

class Demo9 {

	public static void main(String[] args) 
	{
		Student s1 = new Student("张三");
		Student s2 = new Student("陈七");

		s1.country = "小日本";
		System.out.println("姓名："+s1.name+" 国籍："+ s1.country); //  中国   
		System.out.println("姓名："+s2.name+" 国籍："+ s2.country); // 小日本
	}
}
/*
姓名：张三 国籍：小日本
姓名：陈七 国籍：小日本
*/

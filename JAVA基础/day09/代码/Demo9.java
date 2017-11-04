/*
需求：在现实生活中有部分同学在学校期间只会学习，但是有部分学生除了学习外还会赚钱。
interface （定义接口）
implements (实现接口)

分析：
	普通的学生类
	接口
	会挣钱的学生
*/

//普通的学生类
class Student{

	String name;

	public Student(String name){
		this.name = name;
	}

	public void study(){
		System.out.println(name+"好好学习");
	}
}


//挣钱是学生拓展的功能---定义在接口上
interface Money{

	public void makeMoney();
}


//会挣钱的学生
class MoneyStudent extends Student implements Money{

	public MoneyStudent(String name){
		super(name);
	}

	public void makeMoney(){
		System.out.println(name+"好好挣钱，然后交学费！");
	}

}


class Demo9 
{
	public static void main(String[] args) 
	{
		Student s = new Student("李金华");
		s.study();
		//s.makeMoney();
		
		MoneyStudent m = new MoneyStudent("孙双双");
		m.study();
		m.makeMoney();
	
	}


}

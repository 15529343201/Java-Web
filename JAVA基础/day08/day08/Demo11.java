/*
需求：使用java描述一下普通的学生、 java基础班的学生、 就业班的学生。
所有的学生都会学习。但是学习的内容不一样。
普通 的学生： 马克思列宁主义。
基础班的学生：学习的是 javase。
就业班学生： javaee+android.
*/

//普通的学生类
class Student{

	String name;

	//构造函数
	public Student(String name){
		this.name = name;
	}
	
	public void study(){
		System.out.println(name+"学习马克思列宁主义");
	}
}

//基础班的学生是属于学生中一种
class BaseStudent extends Student{


	public BaseStudent(String name){
		super(name);//指定调用父类构造函数
	}

	//重写
	public void study(){
		System.out.println(name+"学习javase..");
	}
}


//就业班学生 也是属于普通学生中一种
class WorkStudent extends Student{
	
	//构造 函数
	public WorkStudent(String name){
		super(name);
	}
		//重写
	public void study(){
		System.out.println(name+"学习javaee+android..");
	}
}


class Demo11 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		BaseStudent s = new BaseStudent("居东东");
		s.study();

		//创建一个就业班的学生
		WorkStudent w = new WorkStudent("张三");
		w.study();
	}
}

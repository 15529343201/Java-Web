package day07;

/*
描述一个员工类，员工具备 的属性：id\ name \ age 。
具备的公共行为： 工作。 

要求：一旦创建一个员工对象 的时候，那么该员工对象就要对应 的属性值。

*/

class Employee{

	
	int id;  //编号

	String name;  //名字

	int age; //年龄

	//构造函数
	public Employee(int a, String b , int c){
		id =a;
		name = b;
		age = c;
	}

	public void work(){
		System.out.println(name+"好好工作，努力挣钱!!");
	}
}


class Demo3 
{
	public static void main(String[] args) 
	{
		//创建一个员工对象
		Employee e = new  Employee(110,"狗娃",20);
		System.out.println("编号："+ e.id+" 名字："+e.name +" 年龄："+ e.age);
	}
}
/*
编号：110 名字：狗娃 年龄：20
*/
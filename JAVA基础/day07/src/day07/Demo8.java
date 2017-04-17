package day07;

/*
需求： 使用java定义一个人类，人具备 id、name 、 age三个属性， 还具备一个比较年龄的方法。
要求： 必须 要 写上构造函数，构造函数也必须要使用上this关键字。
*/

class Person{
		
	int id; //编号

	String name; //姓名
  
	int age;  //年龄

	//构造函数
	public Person(int id,String name ,int age){
		this.id  = id;
		this.name = name;
		this.age = age;
	}

	//比较年龄的方法
	public void compareAge(Person p2){
		if(this.age>p2.age){
			System.out.println(this.name+"大!");
		}else if(this.age<p2.age){
			System.out.println(p2.name+"大!");
		}else{
			System.out.println("同龄");
		}
	}
}


class Demo8{

	public static void main(String[] args) 
	{
		Person p1 = new Person(110,"狗娃",17);
		Person p2 = new Person(119,"铁蛋",9);
		p1.compareAge(p2);

	}
}
/*
狗娃大!
*/

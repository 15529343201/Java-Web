/*
疑问： 为什么要调用父类的构造方法啊？这样子做的意义在那？

	调用父类 的构造方法是可以初始化从父类继承下去的属性的。

*/ 
class Fu{
	
	int x = 10;

	String name;

	public Fu(String name){
		this.name = name;
		System.out.println("Fu类d带参的构造方法...");
	}

	public Fu(){
		System.out.println("Fu类无参的构造方法...");
	}
}


class Zi extends Fu{

	int x = 20;

	public Zi(String name){
		super(name); //指定调用父类一个参数的构造函数。
	}


	public void print(){
		System.out.println("x1 = "+ x);
	}

}


class Demo8 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("大头儿子"); 
		System.out.println("name= "+z.name);

	}
}

/*
instanceof 关键字

instanceof关键字的作用：判断一个对象是否属于指定的类别。

instanceof关键字的使用前提：判断的对象与指定的类别必须要存在继承或者实现的关系。

instanceof关键字的使用格式：
		
		对象  instanceof 类别

instanceof关键字的作用： 目前没用。但是后天我们学习 到了多态之后就非常有用。
一般我们做强制类型转换之前都会使用该关键字先判断一把，然后在进行转换的。


*/
class Animal{

	String name;

	String color;

	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
}


//狗是属于动物中一种
class Dog extends Animal {

	public Dog(String name,String color){
		super(name,color); //指定调用父类两个 参数的构造函数。
	}

	public void bite(){
		System.out.println(name+"咬人!!");
	}
}

//老鼠 也是属于动物中一种
class Mouse extends  Animal{
	
	public Mouse(String name,String color){
		super(name,color);
	}
	
	public void dig(){
		System.out.println(name+"打洞..");
	}

}

class Demo12{

	public static void main(String[] args) 
	{
		Dog d = new Dog("哈士奇","白色");
		System.out.println("狗是狗类吗？"+ (d instanceof Dog));
		System.out.println("狗是动物类吗？"+ (d instanceof Animal));	
		//System.out.println("狗是老鼠类吗？"+ (d instanceof Mouse));		// false true
		
		Animal a = new Animal("狗娃","黄色"); //狗娃是人
		System.out.println("动物都是狗吗？"+ (a instanceof Dog));


	}
}

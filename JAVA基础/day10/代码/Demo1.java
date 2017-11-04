/*
抽象类：

什么是时候使用抽象类：
	描述一类事物的时候，发现该事物确实存在着某种 行为，但是 目前这种 
	是不具体的，这时候应该抽取这种行为的声明，而不去实现该种行为，这时候
	这种行为我们把它称为抽象的行为，这时候应该使用抽象类。

抽象类要注意的细节：
	1. 如果一个方法没有方法体，那么该方法必须使用abstract修饰。
	2. 如果一个类函数抽象方法，那么这个类肯定是一个抽象类或者接口。
	3. 抽象类不能创建对象。
	4. 抽象类是含有构造方法的。
	5. 抽象类可以存在非抽象方法与抽象方法。
	6. 抽象类可以不存在抽象方法。
	7. 非抽象类继承抽象类的时候，必须要把抽象类中所有抽象方法全部实现。

abstract不能与以下关键字一起使用
	1.abstract 不能与static共同修饰一个方法。
	2. abstract 不能与private共同修饰一个方法。
	3. abstract不能以final关键字共同修饰一个方法。


接口：

接口的定义格式：
	
	interface 接口名{
		成员变量

		成员函数..
	}

接口的作用：
	1. 程序解耦。
	2. 定义约束规范
	3. 拓展功能。

接口要注意的细节：
	1. 接口中成员变量都是常量，默认 的修饰符是 public static fianl.
	2. 接口中的方法全部都是抽象的方法，默认的修饰符： public abstract。
	3. 接口不能创建对象。
	4. 接口是没有构造函数 的。
	5. 非抽象类通过implements实现接口的时候，必须要把接口中所有方法全部实现。 


接口与类之间 的关系： 实现关系。

注意： 一个类可以实现多个接口。

接口与接口之间的关系： 继续关系。

注意： 一个接口是可以继承多个接口的。


多态：父类的引用类型变量指向了子类的对象，或者是接口的引用类型变量指向了接口实现类的对象。


多态要注意细节：
	1. 多态情况下，如果子父类存在同名的成员变量时，访问的是父类的成员变量.
	2. 多态情况下，如果子父类存在同名的非静态函数时，访问的是子类 的成员函数。
	3. 多态情况下，如果子父类存在同名的静态函数时，访问的是父类的成员函数。
	4. 多态情况下， 不能访问子类特有的成员。

多态的应用： 
	1.多态用于形参类型的时候，可以接收更多类型的数据
	2. 多态用于返回值类型的时候，可以返回更多类型的数据.












*/
class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

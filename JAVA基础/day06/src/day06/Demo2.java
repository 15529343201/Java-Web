package day06;

/*

需求： 使用java描述一个车与修车厂两个事物， 车具备的公共属性:轮子数、 名字、 颜色 ，还
具备跑的功能行为。跑之前要检测轮子是否少于了4个，如果少于了4个，那么要送到修车厂修理，
修车厂修理之后，车的轮子数要补回来4个。 然后车就继续的跑起来。

修车厂： 具备公共属性： 名字、 地址、 电话。
		 公共的行为： 修车。

初学者的经典错误：
	1. 变量在同一个作用域(大括号)上是可以直接访问的。
	2. 如果一个类要访问另外一个类变量时，那么这时候就只能通过创建对象进行访问。（仅对于目前正确）
*/

//车类
class Car{
	
	//事物的公共属性使用成员变量描述	
	String name ; // 名字

	String color; //名字

	int wheel; //轮子数
	
	//事物的公共行为使用函数描述
	public void run(){
		if(wheel>=4){
			System.out.println(name+wheel+"个轮子飞快跑起来..");
		}else{
			System.out.println(name+"不够4个轮子了，赶快去修理");
		}
	}
}

//修车厂
class CarFactory{
	
	String name;//名字
	
	String address ;	//地址
	
	String tel;	//电话

	//修车公共行为 ------ 返回值类型、 未知的参数
	public void repair(Car c){
		if(c.wheel>=4){
			System.out.println("告诉你，费了很大力气修好了，给钱");
		}else{
			c.wheel = 4;
			System.out.println("修好了，给钱!!");	
		}
	}
}


class Demo2 
{
	public static void main(String[] args) 
	{	
		
		//0x98
		Car c = new Car();
		//给车对象赋予属性值
		c.name = "陆丰";
		c.color = "黑色";
		c.wheel = 4;
		
		for(int i = 0 ; i<5 ; i++){
			c.run();
		}
		c.wheel = 3;
		c.run();

		//创建修车厂对象
		CarFactory f = new CarFactory();
		//给修车厂赋予属性值
		f.name = "集群宝修车厂";
		f.address = "韵泰商业广场一楼";
		f.tel = "020-1234567";

		//调用修车的修车
		f.repair(c);//0x98
		//
		c.run();
		

		//需求： 调用一次repair方法。  前提： 该对象调用完一个方法之后，这个对象就不再使用了。
		/*CarFactory f=new CarFactory();
		f.repair(new Car());*/
	}
}
/*
 * 陆丰4个轮子飞快跑起来..
陆丰4个轮子飞快跑起来..
陆丰4个轮子飞快跑起来..
陆丰4个轮子飞快跑起来..
陆丰4个轮子飞快跑起来..
陆丰不够4个轮子了，赶快去修理
修好了，给钱!!
陆丰4个轮子飞快跑起来..
*/


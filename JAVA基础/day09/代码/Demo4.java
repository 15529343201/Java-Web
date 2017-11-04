/*
需求： 描述一个图形、圆形、 矩形三个类。不管哪种图形都会具备计算面积
与周长的行为，但是每种图形计算的方式不一致而已。

常量的命名规范：全部字母大写，单词与单词 之间 使用下划线分隔。


abstract不能与以下关键字共同修饰一个方法：
	1. abstract不能与private共同修饰一个方法。
	2. abstract 不能与static共同修饰一个方法。
	3. abstract 不能与final共同修饰一个方法。

*/
//abstract 抽象

//图形类
abstract class MyShape{ 

	String name;

	public MyShape(String name){
		this.name = name;
	}

	public  abstract void getArea();
	
	public abstract void getLength();
}

//圆形 是属于图形类的一种
class Circle extends MyShape{
	
	double r;

	public static final double PI = 3.14;

	public Circle(String name,double r){
		super(name);
		this.r =r;
	}

	public  void getArea(){
		System.out.println(name+"的面积是："+PI*r*r);
	}
	
	public  void getLength(){
		System.out.println(name+"的周长是："+2*PI*r);
	}
}

class Circle extends MyShape(){
	
	double r;
	
	public static final double PI=3.14;
	
	public Circle(String name,double r){
	super(name);
	this.r=r;
	}
	public void getArea(){
	System.out.println(name+"的面积是："+PI*r*r);
	}
	public void getLength(){
	System.out.println(name+"的周长是："+2*PI*r);
	}
}

//矩形 属于图形中的 一种
class Rect extends MyShape{

	int width;

	int height;

	public Rect(String name,int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public  void getArea(){
		System.out.println(name+"的面积是："+width*height);
	}
	
	public  void getLength(){
		System.out.println(name+"的周长是："+2*(width+height));
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		Circle c = new Circle("圆形",4.0);
		c.getArea();
		c.getLength();

		//矩形
		Rect r = new Rect("矩形",3,4);
		r.getArea();
		r.getLength();
	
	}
}

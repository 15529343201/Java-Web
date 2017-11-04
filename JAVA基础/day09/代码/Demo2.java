/*
final(最终、修饰符)  
	
final关键字的用法：
	1. final关键字修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的。
	2. fianl关键字修饰一个引用类型变量时，该变量不能重新指向新的对象。
	3. final关键字修饰一个函数的时候，该函数不能被重写。
	4. final关键字修饰一个类的时候，该类不能被继承。


常量 的修饰符一般为： public static final 

*/

//圆形
class Circle{

	double r; //半径

	public static final double pi = 3.14; //固定不变的

	public Circle(double r){
		this.r = r;
	}

	//计算面积
	public final void getArea(){
		System.out.println("圆形的面积是："+r*r*pi);
	}
}



class Demo2 extends Circle
{
	
	public Demo2(double r){
		super(r);
	}

	public static void main(String[] args) 
	{
		/*
		final Circle c = new Circle(4.0);
		test(c);
		*/	
		Demo2 c = new Demo2(4.0);
		c.getArea();
	}
	

	
	public static void test(Circle c){
		c = new Circle(5.0);  //c变量又重新指向了新的对象。
		c.getArea();
	}

}

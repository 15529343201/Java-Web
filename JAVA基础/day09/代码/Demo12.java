/*
多态的应用：
  1. 多态用于形参类型的时候，可以接收更多类型的数据 。
  2. 多态用于返回值类型的时候，可以返回更多类型的数据。



多态的好处： 提高了代码的拓展性。

需求1： 定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长。
*/

//图形类
abstract class MyShape{

	public abstract void getArea();

	public abstract void getLength();	
}



class Circle extends MyShape{

	public static final double PI = 3.14;

	double r;

	public Circle(double r){
		this.r =r ;	
	}

	public  void getArea(){
		System.out.println("圆形的面积："+ PI*r*r);
	}

	public  void getLength(){
		System.out.println("圆形的周长："+ 2*PI*r);
	}
}


class Rect  extends MyShape{

	int width;

	int height;

	public Rect(int width , int height){
		this.width = width;
		this.height = height;
	}

	public  void getArea(){
		System.out.println("矩形的面积："+ width*height);
	}

	public  void getLength(){
		System.out.println("矩形的周长："+ 2*(width+height));
	}
}



class Demo12 {

	public static void main(String[] args) 
	{
		/*
		//System.out.println("Hello World!");
		Circle c = new Circle(4.0);
		print(c);

		Rect r = new Rect(3,4);
		print(r);
		*/

		MyShape m = getShape(0); //调用了使用多态的方法，定义的变量类型要与返回值类型一致。
		m.getArea();
		m.getLength();
		

	}


	//需求1： 定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长。
	public static void print(MyShape s){ // MyShpe s = new Circle(4.0);
		s.getArea();
		s.getLength();
	}


	// 需求2： 定义一个函数可以返回任意类型的图形对象。
	public static MyShape  getShape(int i){
		if (i==0){
			return new Circle(4.0);
		}else{
			return new Rect(3,4);
		}
	}


}

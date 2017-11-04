/*
类与接口之间关系： 实现关系。

类与接口要注意的事项：
	1. 非抽象类实现一个接口时，必须要把接口中所有方法全部实现。
	2. 抽象类实现一个接口时，可以实现也可以不实现接口中的 方法。
	3. 一个类可以实现多个接口 。
		
		疑问： java为什么不支持多继承，而支持了多实现呢？
			class A{
				
				public void print(){
					System.out.println("AAAAAA");
				}
			}

			class B{

				public void print(){
					System.out.println("BBBBBB");
				}
			}


			class C extends A ,B{
			
			}
			
			new C().print();
	
接口与接口之间关系： 继承关系。

接口与接口之间要注意事项：
	1. 一个接口是可以继承多个接口的。


*/



interface A{

	public void print();
}


interface C{
	
	public void getArea();
}


interface B extends A,C{ // B接口继承A接口

	public void test();
}



class Demo10 implements B{

	public static void main(String[] args) 
	{
		Demo10 d = new Demo10();
		d.print();

	}

	public void getArea(){}


	public void test(){}


	public void print(){
		System.out.println("这个是A接口的print方法...");
	}
}

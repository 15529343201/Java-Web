/*
一个类最多只能有一个直接的父类。但是有多个间接的父类。

java是单继承。

*/

class Ye{

	String name;

}

class Fu extends Ye{

}

//
class  Zi extends Fu{

}

class Demo6 
{
	public static void main(String[] args) 
	{
	//	System.out.println("Hello World!");
		Zi zi =new Zi();
		zi.name = "狗娃";
	}
}

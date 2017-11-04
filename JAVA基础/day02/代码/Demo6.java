/*
声明变量的方式：

	声明变量的方式一：
			
			数据类型 变量名;
				
	声明变量的方式二： 一次性声明了多个相同类型变量
	
			数据类型  变量名1 ， 变量2....

注意：
	1. 变量是必须先声明再使用。
	2. 在一个作用域中不能声明同名 的变量。


*/
class Demo6  
{
	public static void main(String[] args) 
	{	
		//int age = 12; //声明一个变量
	
		int age ,height ;  //声明了变量
		//给变量赋值
		age = 10;
		height = 175;


		
		System.out.println(age);
		System.out.println(height);

	}
}

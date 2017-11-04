/*
控制流程语句之---for循环语句


for循环语句的格式:

	for(初始化语句;判断语句;循环后的语句){
		循环语句;
	}


for循环语句 要注意的事项：
	1. for(;;)这种写法 是一个死循环语句，相当于while(true);
	2. for循环语句的初始化语句只会执行一次，只是在第一次循环的时候执行而已。
	3. for循环语句的循环体语句只有一句的时候，可以省略大括号不写。但是不建议省略。

需求： 在控制上打印五句hello world.

*/
class Demo11 
{
	public static void main(String[] args) 
	{	
		/*
		int count=0;
		while(count<5);{
			System.out.println("Hello World!");
			count++;
		}
		
		int count = 0 ;
		for(System.out.println("初始化语句A");count<5 ;System.out.println("循环后的语句C")){
			System.out.println("循环体语句B");
			count++;
		}
		*/


		for(int count = 0 ; count<5;  count++){
			
		}
		
		{
			System.out.println("hello world");
		}
		

	}
}

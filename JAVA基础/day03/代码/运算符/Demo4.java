/*
	++ （自增） :  自增就是相当于操作数+1.

	前自增：++位于操作数的前面。  比如： ++a；
	
	前自增：先自增，后使用。
				

	后自增： 先使用，后自增。
	

*/
class Demo4 
{
	public static void main(String[] args) 
	{
		/*
		int a = 0;
		//int sum = ++a; //前自增。 a = a+1  ， sum = a
		int sum = a++; //后自增  sum = 0 , a = a+1
		System.out.println("sum= "+ sum+ " a = "+ a); //1 


后自增在jvm的运行原理：
	
	因为后自增要使用 到没有+1之前 的值，那么jvm会先声明一个变量用于保存没有+1之前的值。
	
	
	int i = 0;
	i = temp;

	原理：
		1. int temp = i; // 声明了一个临时变量用于记录了i没有加1之前的值。
		2. 自增。  i = i+1;   i = 1;
		3. temp把用作了表达式 的结果。
	
	i的值发生了几次变化：
			i = 0 -----> 1----> 0

*/
		int i = 0;
		i = i++; // 后自增...  后自增要使用到没有+1之前的值。
		System.out.println("sum ="+ sum+ "i= "+i);
	}
}

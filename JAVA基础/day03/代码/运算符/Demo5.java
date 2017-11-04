/*
自减： 操作数-1.

前自减: --位于操作数的前面。  --操作数

前自减： 先自减，后使用。

----------------------------------------------

后自减：--位于操作数的后面。 操作数--；

后自减： 先使用，后自减。

*/
class Demo5 
{
	public static void main(String[] args) 
	{	
		/*
		int i = 1;
		int sum = --i;  //前自减   i = i-1 , sum = i;
		int sum = i--; // 后自减   sum = i ; i = i-1;
		System.out.println("sum = "+ sum);  // 0  1 
		*/

		int num = 10;
		//int sum = 10* num++; //后自增
		int sum = 10* ++num; //前自增 
		System.out.println("sum = "+ sum);

	}
}

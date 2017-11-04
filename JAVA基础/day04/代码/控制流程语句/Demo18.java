/*
continue关键字

continue的适用范围： continue只能用于循环语句。

continue的作用：continue的作用是跳过本次的循环体内容。继续下一次。

continue要注意的事项：
	1. 在一种情况下，continue后面不能跟有其他语句，因为是永远都无法执行到。
	2. continue 也可以配合标记使用的。

*/

class Demo18 
{
	public static void main(String[] args) 
	{
		/*
		for(int i = 0 ; i<5 ; i++){ // i=1  2
			if(i==1){
				continue;
			}
			System.out.println("hello "+i);
		}

		
		
		outer:for(int i = 0 ; i<3; i++){ // i= 0;  i =1 i=2 3
			inner:for(int j = 0 ; j<2 ; j++){ //j=0
				System.out.println("hello"); //1 2 3
				continue outer;
			}
		}

		需求： 计算1-100的偶数总和.
		*/
		
		int sum = 0 ;
		for(int num = 1 ; num<=100 ; num++){
			if(num%2!=0){
				continue;  //如果是奇数就跳过本次循环。
			}
			
			sum  = sum+num;
		}

		System.out.println("总和："+ sum);


	}
}

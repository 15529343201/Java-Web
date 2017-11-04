/*
需求1:计算1-100,7的倍数总和。 7  14 21


如何产生一个随机数。

步骤：	
	1. 创建一个随机数对象。
	2. 调用随机数对象的nextInt方法。
	3. 导包。
*/
class Demo7 {

	public static void main(String[] args){
		int num = 1;
		int sum = 0;	//定义一个变量用于保存每次相加的总和。
	
		while(num<=100){ // num = 1
			
			if(num%7==0){
				sum = sum+num;
				
			}
			num++;	
			
			
		}

		System.out.println("总和是："+ sum);
		
	}
}

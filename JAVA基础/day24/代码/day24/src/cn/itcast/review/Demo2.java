package cn.itcast.review;
/*

continue: 跳过本次循环语句，继续下一次循环。

continue的作用范围： 只能适用于循环语句。

一旦执行了continue语句，那么在循环体内continue之后的循环 语句跳过执行。

break: 用于结束一个循环语句或者是一个switch语句.

break作用范围： 只能用于循环语句或者是switch语句。
 
return
 
 */


public class Demo2 {

	public static void main(String[] args) {
		/*
		 * continue
		 * for(int i = 0 ; i<5 ; i++){
			if(i==1){
				continue;
			}

			System.out.println("i="+i);
		}
		*/
		
		//break
		/*outer:for(int j = 0 ; j<2; j++){ // j=0  j=1
			inner:for(int i = 0 ; i<3 ; i++){ //i=0
				System.out.println("hello world");
				break outer; //结束当前所在的循环。 如果配合标识的使用，可以作用于外层的for循环。
			}
		}*/
		
		
		for(int i = 0 ; i<3 ; i++){
			System.out.println("hello world");
			return;
		}
		System.out.println("哈哈");

	}	

	
	
}

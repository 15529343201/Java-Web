/*
注意： 如果一个函数的返回值类型是具体的数据类型，那么该函数就必须要保证在任意情况下都保证有返回值。（除了返回值类型是void以外）

return 关键字的作用：
	1. 返回数据给函数的调用者。
	2. 函数一旦执行到了return关键字，那么该函数马上结束。 (能结束一个函数)

注意：一个函数的返回值类型 是void，那么也可以出现return关键字，但是return关键字的后面不能有数据。

break关键字与return关键字的区别：
	1.break关键字是结束一个循环。
	2. return关键字是结束一个函数。


*/
class Demo2 {

	public static void main(String[] args) 
	{
	//	String result = getGrade(10);	//调用函数
	//	System.out.println("对应的等级是："+ result );
		//add(0,2);
		print();
	}



	public static void print(){
		for(int i = 0 ; i < 5;  i++){
			System.out.println("hello world");
			///break; //结束了当前的循环
			return ; //结束当前的函数
		}

		System.out.println("哈哈我能执行吗??");
	}



	
	//目前该函数的返回值类型是void，那么是否可以存在return关键字呢？
	public static void add(int a , int b){
		if(a==0){
			return; //结束一个函数
		}
		System.out.println("总和："+(a+b));
	}





	public static String  getGrade(int score){	//未知的参数定义在形参中， 由函数的调用者确定。
		if(score>=90&&score<=100){
			return "A等级";
		}else if(score>=80&&score<=89){
			return "B等级";
		}else if(score>=70&&score<=79){
			return "C等级";
		}else if(score>=60&&score<=69){
			return "D等级";
		}else if(score>=0&&score<=59){
			return "E等级";
		}else{
			return "补考等级";
		}		
	}

}

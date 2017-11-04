
/*
异常的处理方式----抛出处理
	
抛出处理（throw throws）


抛出处理要注意的细节：
	1. 如果一个方法的内部抛出了一个异常 对象，那么必须要在方法上声明抛出。
	2. 如果调用了一个声明抛出异常 的方法，那么调用者必须要处理异常。
	3. 如果一个方法内部抛出了一个异常对象，那么throw语句后面的代码都不会再执行了（一个方法遇到了throw关键字，该方法也会马上停止执行的）。
	4. 在一种情况下，只能抛出一种类型异常对象。

throw 与throws两个关键字：
	1. throw关键字是用于方法内部的，throws是用于方法声声明上的。
	2. throw关键字是用于方法内部抛出一个异常对象的，throws关键字是用于在方法声明上声明抛出异常类型的。
	3. throw关键字后面只能有一个异常对象，throws后面一次可以声明抛出多种类型的 异常。


疑问：何时使用抛出处理？何时捕获处理？原则是如何？
	如果你需要通知到调用者，你代码出了问题，那么这时候就使用抛出处理.
	如果代码是直接与用户打交道遇到了异常千万不要再抛，再抛的话，就给了用户了。
	这时候就应该使用捕获处理。

*/
class Demo11 
{
	public static void main(String[] args) 
	{
		try{
			int[] arr = null;
			div(4,0,arr); //调用了一个 声明抛出异常类型 的方法
		}catch(Exception e){
			System.out.println("出现异常了...");
			e.printStackTrace();
		}
		
	}


	public static void div(int a, int b,int[] arr) throws Exception,NullPointerException {
		if(b==0){
			throw new Exception(); //抛出一个异常对象...
		}else if(arr==null){
			throw new  NullPointerException();
		}
		int c = a/b;
		System.out.println("c="+c);
	}
}

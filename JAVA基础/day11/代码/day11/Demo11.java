/*
模板模式 ：解决某类事情的步骤有些是固定的，有些是会发生变化的，那么这时候我们可以
为这类事情提供一个模板代码，从而提高效率 。


需求；编写一个计算程序运行时间 的模板。

模板模式的步骤：
	1. 先写出解决该类事情其中 的一件的解决方案。
	2. 分析代码，把会发生变化的代码抽取出来独立成一个方法。把该方法描述成一个抽象的方法。
	3. 使用final修饰模板方法，防止别人 重写你的模板方法。

*/
abstract class MyRuntime{
	
	public final void getTime(){
		long startTime = System.currentTimeMillis();	//记录开始的时间
		code();
		long endTime = System.currentTimeMillis();  //记录结束的时间.
		System.out.println("运行时间 ："+ (endTime-startTime));
	}

	public abstract void code();
}




class Demo11 extends MyRuntime
{
	public static void main(String[] args) 
	{
		Demo11 d = new Demo11();
		d.getTime();
	}


	
	//code方法内部就写要计算运行时间 的代码；
	public  void code(){
		int i = 0;
		while(i<100){
			System.out.println("i="+i);
			i++;
		}

	}
}

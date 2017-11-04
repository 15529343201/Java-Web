/*
finally 块；

finally块的 使用前提是必须要存在try块才能使用。

finally块的代码在任何情况下都会执行的，除了jvm退出的情况。

finally非常适合做资源释放的工作，这样子可以保证资源文件在任何情况下都 会被释放。



try块的三种组合方式：


第一种： 比较适用于有异常要处理，但是没有资源要释放的。
		 try{

			可能发生异常的代码
	
			}catch(捕获的异常类型 变量名){
				处理异常的代码
			}

第二种：比较适用于既有异常要处理又要释放资源的代码。
		
		try{

			可能发生异常的代码
	
			}catch(捕获的异常类型 变量名){
				处理异常的代码
			}finally{ 
				释放资源的代码;
			}

第三种： 比较适用于内部抛出的是运行时异常，并且有资源要被释放。
		   try{

			可能发生异常的代码
	
			}finally{ 
				释放资源的代码;
			}
	
*/


class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		div(4,0);
	}


	public static void div(int a, int b){
		try{
			if(b==0){
				System.exit(0);//退出jvm
			}
			int c = a/b;
			System.out.println("c="+ c);

		}catch(Exception e){
			System.out.println("出了除数为0的异常...");
			throw e;
		}finally{
			System.out.println("finall块的代码执行了..");
		}
	}
}

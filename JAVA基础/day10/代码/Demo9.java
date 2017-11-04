/*
异常的体系：
----------| Throwable  所以异常或者错误类的超类
--------------|Error  错误   错误一般是用于jvm或者是硬件引发的问题，所以我们一般不会通过代码去处理错误的。
--------------|Exception 异常   是需要通过代码去处理的。

如何区分错误与异常呢：
	如果程序出现了不正常的信息，如果不正常的信息的类名是以Error结尾的，那么肯定是一个错误。
	如果是以Exception结尾的，那么肯定就是一个异常。


*/
class Demo9 
{
	public static void main(String[] args) 
	{
		//java虚拟机在默认的情况下只能管理64m内存。
		byte[] buf = new byte[1024*1024];
		System.out.println("Hello World!");
	}
}

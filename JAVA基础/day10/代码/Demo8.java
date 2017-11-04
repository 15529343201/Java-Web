/*
异常：

我们的java程序也是会存在某些不正常 的情况的，这些不正常的 情况我们就统称异常。


异常体系：
--------| Throwable
------------| Error
------------| Exception


Throwable常用的方法：
	toString()  返回当前异常对象的完整类名+病态信息。
	getMessage() 返回的是创建Throwable传入的字符串信息。
	printStackTrace() 打印异常的栈信息。
*/

class Demo8 
{
	public static void main(String[] args) 
	{
		/*
		//创建了一个Throwable对象。
		Throwable t = new Throwable("头晕，感冒..");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString: "+ info);  // java.lang.Throwable  包名+类名 = 完整类名
		System.out.println("message: "+ message);
		*/
		test();
	}

	public static void test(){
		//
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}

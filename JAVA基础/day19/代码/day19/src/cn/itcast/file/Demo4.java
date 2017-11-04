package cn.itcast.file;

import java.io.File;

/*
删除：
delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除


	判断：
		exists()		文件或文件夹是否存在。
		isFile()		是否是一个文件，如果不存在，则始终为false。
		isDirectory()	是否是一个目录，如果不存在，则始终为false。
		isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
		isAbsolute()	测试此抽象路径名是否为绝对路径名。



*/
public class Demo4 {
	
	public static void main(String[] args) {
	/*	
	    删除的。
	 * File file = new File("F:\\a.txt");
		System.out.println("删除成功吗？ "+ file.delete()); //delete方法不能用于删除非空的文件夹。 delete方法会马上删除一个文件。
		file.deleteOnExit();  //jvm退出的时候删除文件。  一般用于删除临时 文件。		
		System.out.println("哈哈哈");
		
		判断
	*/
		File file = new File("..\\..\\a.txt");
		System.out.println("存在吗？"+ file.exists());
		System.out.println("判断是否是一个文件："+file.isFile()); //如果是文件返回true，否则返回false.
		System.out.println("判断是否是一个文件夹："+ file.isDirectory()); // 是文件夹返回ture，否则返回false.
		System.out.println("是隐藏的 文件吗："+ file.isHidden());
		System.out.println("是绝对路吗？"+ file.isAbsolute());
	}	

}

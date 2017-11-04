package cn.itcast.eclipse;
import java.io.File;
/*
使用eclipse 好处：
	
	1. ctrl + /   内部补全。
	2. 不需要你再使用javac工具编译，你在Eclipse上面一旦保存，Eclipse自动编译。
	3.  精准报错，自动修复(ctrl+ 1)。
	
*/
public class Demo1 {

	public static void main(String[] args) {
		File file = new File("F:\\a.txt");
		
		System.out.println("aaa");
		System.out.println("hello world");
	}
	
}

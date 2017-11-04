package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 装饰者设计模式：增强一个类的功能，而且还可以让这些装饰类互相装饰。
 
 BufferedReader是不是拓展了FileReader的功能。
 BuferedWriter 也是拓展了FileWriter的功能。
 
 需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。
 
  需求2：编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
  
  需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。
  
 
 需求4： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号。
  
 需求5： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号+ 双引号。

 需求6： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号+ 行号。
   
 需求7： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号+双引号。
 
----| Reader
-----------| BufferedReader
---------------| BufferedLineNum  带行号
---------------| BufferedSemi    带分号
---------------| BufferedQuto   带双引
---------------| 子类.. 
---------------|

增强一个类的功能时候我们可以选择使用继承：
	
	通过继承实现增强一个类的功能优点：   代码结构清晰，通俗易懂。
	
	缺点： 使用不灵活，会导致继承的体系过于庞大。
	
 
 
 
 */
class BufferedLineNum extends BufferedReader{
	//行号
	int count = 1 ;

	public BufferedLineNum(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine(); 
		if(line ==null){
			return null;
		}
		line = count+" "+ line;
		count++;
		return line;
	}	
}


//带分号的缓冲输入字符流
class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}
}


//带双引号的缓冲输入字符流
class  BufferedQuto extends BufferedReader{

	public BufferedQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line+"\"";
		return line;
	}
}





public class Demo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		//建立数据的输入通道
		FileReader fileReader = new FileReader(file);
		//建立带行号的缓冲输入字符流
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		
		//带有分号的缓冲输入字符流
		BufferedSemi bufferedSemi = new BufferedSemi(fileReader);
		
		//带有双引号的缓冲输入字符流
		BufferedQuto bufferedQuto = new BufferedQuto(fileReader);
		
		
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}
		
	}
	
}

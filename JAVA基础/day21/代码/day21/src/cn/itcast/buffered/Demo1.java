package cn.itcast.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
输入字符流:
-------| Reader 所有输入字符流的基类。 抽象类
----------| FileReader 读取文件字符串的输入字符流。
----------| BufferedReader   缓冲输入字符流  。 缓冲 输入字符流出现的目的是为了提高读取文件 的效率和拓展了FileReader的功能。  其实该类内部也是维护了一个字符数组

记住：缓冲流都不具备读写文件的能力。

BufferedReader的使用步骤：
	1.找到目标文件
	2 .建立数据的输入通道。
	
	


 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
//		 readTest1();
		File file  = new File("F:\\1208project\\day21\\src\\cn\\itcast\\buffered\\Demo1.java");
		//建立数据的输入通道。
		FileReader fileReader = new FileReader(file);
		String line =  null;
		
		while((line = myReadLine(fileReader))!=null){
			System.out.println(line);
		}
	}
	
	
	
	//自己去实现readLine方法。
	public static String myReadLine(FileReader fileReader) throws IOException{
		//创建一个字符串缓冲类对象
		StringBuilder sb = new StringBuilder();  //StringBuilder主要是用于存储读取到的数据
		int content = 0 ;
		while((content = fileReader.read())!=-1){
			if(content=='\r'){
				continue;
			}else if(content=='\n'){
				break;
			}else{
				//普通字符
				sb.append((char)content);
			}
		}
		//代表已经读取完毕了。
		if(content ==-1){
			return null;
		}
		
		return sb.toString();  
	}
	
	
	
	
	
	
	
	public static void readTest1() throws IOException{
		//找到目标文件
		File file  = new File("F:\\a.txt");
		//建立数据的输入通道。
		FileReader fileReader = new FileReader(file);
		//建立缓冲输入字符流
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//读取数据
		/*int content = bufferedReader.read();  //读到了一个字符。 读取到的字符肯定也是从Bufferedreader内部的字符数组中获取的到。所以效率高。
		System.out.println((char)content);*/
		//使用BUfferedReader拓展的功能，readLine()  一次读取一行文本，如果读到了文件的末尾返回null表示。
		String line =  null;
		while((line = bufferedReader.readLine())!=null){ // 虽然readLine每次读取一行数据，但是但会的line是不包含\r\n的、
			System.out.println(Arrays.toString("aaa".getBytes()));
		}
		//关闭资源
		bufferedReader.close();
		
	}
	
}

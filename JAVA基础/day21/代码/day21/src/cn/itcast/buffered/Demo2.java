package cn.itcast.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流
----------| Writer  所有输出字符流的基类，  抽象类。
--------------- | FileWriter 向文件输出字符数据的输出字符流。 
----------------| BufferedWriter 缓冲输出字符流          缓冲输出字符流作用： 提高FileWriter的写数据效率与拓展FileWriter的功能。
BufferedWriter内部只不过是提供了一个8192长度的字符数组作为缓冲区而已，拓展了FileWriter的功能。

BufferedWriter如何使用？
	1. 找到目标文件
 	2. 建立数据的输出通道



 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		//找到目标文件
		File file = new File("F:\\a.txt");
		//建立数据的输出通道
		FileWriter fileWriter = new FileWriter(file,true);
		//建立缓冲输出流对象
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
		//写出数据
//		bufferedWriter.newLine(); //newLine() 换行。 实际上就是想文件输出\r\n.
		bufferedWriter.write("\r\n");
		bufferedWriter.write("前两天李克强来萝岗！！");
		//关闭资源
		bufferedWriter.flush();
//		bufferedWriter.close();
		
	}
	
}

package cn.itcast.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
何时使用字符流，何时使用字节流？依据是什么？

使用字符流的应用场景： 如果是读写字符数据的时候则使用字符流。

使用字节流的应用场景： 如果读写的数据都不需要转换成字符的时候，则使用字节流。 
 
 
 */
//使用字符流拷贝文件
public class Copy {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Test.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Test.exe"));
		String line=null;
		while((line = bufferedReader.readLine())!=null){
		bufferedWriter.write(line);
		}
		bufferedWriter.close();
		bufferedReader.close();
	}
	

}

package cn.itcast.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
//		writeTest();
		readrTest();
	}
	
	
	//使用字节流读取中文
	public static void readrTest() throws IOException{
		//找到目标文件
		File file = new File("F:\\a.txt");
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		//读取内容
		//int content = 0;
		
		/*while((content = fileInputStream.read())!=-1){ //出现乱码的原因： 一个中文在gbk码表中默认是占两个字节，
													   // 目前你只读取了一个字节而已，所以不是一个完整的中文。
			System.out.print((char)content);
		}*/
		
		byte[] buf = new byte[2];
		for(int i = 0 ; i < 3 ; i++){
			fileInputStream.read(buf);
			System.out.print(new String(buf));
		}
		//关闭资源
		fileInputStream.close();
		
	}
	
	
	
	
	//使用字节流写中文。   字节流之所以能够写中文是因为借助了字符串的getBytes方法对字符串进行了编码（字符---->数字）。 
	public static void writeTest() throws IOException{
		//找到目标文件
		File file = new File("F:\\a.txt");
		//建立数据的输出通道
		FileOutputStream fileOutputStream  = new FileOutputStream(file);
		//准备数据，把数据写出。
		String data = "大家好";
		byte[] buf = data.getBytes();	//把字符串转换成字节数组
		System.out.println("输出的内容："+ Arrays.toString(buf));
		fileOutputStream.write(buf);
		///关闭资源
		fileOutputStream.close();
	}

}

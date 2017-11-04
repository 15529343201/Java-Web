package cn.itcast.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流:

------| Writer 输出字符流的基类。 抽象类
-----------| FileWriter 向文件数据数据的输出字符流

FileWriter的使用步骤：
	1. 找到目标文件。
	2. 建立数据输出通道
	3. 写出数据。
	4. 关闭资源
	
FileWriter要注意的事项：
	1. 使用FileWriter写数据的时候，FileWriter内部是维护了一个1024个字符数组的，写数据的时候会先写入到它内部维护的字符数组中，如果需要
	把数据真正写到硬盘上，需要调用flush或者是close方法或者是填满了内部的字符数组。
	2. 使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件。
	3.使用FileWriter的时候， 如果目标文件已经存在了，那么默认情况会先情况文件中的数据，然后再写入数据 ， 如果需要在原来的基础上追加数据，
	需要使用“new FileWriter(File , boolean)”的构造方法，第二参数为true。
	

练习： 使用字符流拷贝一个文本文件(java文件). 
接着使用字符流拷贝一个图片（观察图片的大小变化，思考为什么会这样子??）

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		writeTest1();
	}
	
	public static void  writeTest1() throws IOException{
		//找到目标文件
		File file = new File("F:\\a.txt");
		//建立数据输出通道
		FileWriter fileWriter = new FileWriter(file,true);
		//准备数据，把数据写出
		String data = "今天天气非常好！！";
		fileWriter.write(data);  //字符流具备解码的功能。
		//刷新字符流
//		fileWriter.flush();
		//关闭资源
		fileWriter.close();
		
		
		
	}
}

package cn.itcast.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
对象的深克隆： 对象的深克隆就是利用对象的输入输出流把对象先写到文件上，然后再读取对象的
信息这个过程就称作为对象的深克隆。
	
	ObjectInputStream
	ObjectOutputStream 

 */
public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address address = new Address("广州");
		Person p1 = new Person(110,"狗娃",address);
		writeObj(p1);
		Person p2  =readObj();
		
		p2.address.city = "长沙";
		System.out.println("p1:"+ p1);
		System.out.println("p2:"+ p2);
		
		
	}
	
	
	//再从文件中读取对象的信息
	public static Person readObj() throws ClassNotFoundException, IOException{
		FileInputStream fileInputStream = new FileInputStream("F:\\obj.txt");
		//创建对象的输入流对象
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return (Person) objectInputStream.readObject();
	}
	
	
	//先要把对象写到文件上。
	public static void writeObj(Person p) throws IOException{
		//建立一个文件 的输出流对象
		FileOutputStream fileOutputStream  = new FileOutputStream("F:\\obj.txt");
		//建立对象的输出流
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//把对象写出
		objectOutputStream.writeObject(p);
		//关闭资源
		objectOutputStream.close();
		
	}
	
	
	
}

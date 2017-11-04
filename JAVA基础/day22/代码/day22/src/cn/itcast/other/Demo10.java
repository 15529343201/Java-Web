package cn.itcast.other;

import java.io.File;

/*
 需求1：列出一个文件夹的子孙文件与目录。
 
 2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：
		第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。

3，列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示：
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar

需求4: 删除一个非空的文件夹。 
 
 
作业：  剪切一个非空目录。

 
 */


public class Demo10 {
	
	public static void main(String[] args) {
	/*	File dir = new File("F:\\1208project\\day22");
		listFiles3(dir,"|--");*/
		
		File dir = new File("F:\\aa");
		deleteDir(dir);
	}
	
	
	//删除了一个非空的目录
	public static void deleteDir(File dir){ // bb
		File[] files = dir.listFiles(); //列出了所有的子文件
		for(File file : files){
			if(file.isFile()){
				file.delete();
			}else if(file.isDirectory()){
				deleteDir(file);
			}
		}
		dir.delete();
	}
	
	
	
	
	public static void listFiles3(File dir,String space){ //space 存储的是空格
		File[] files = dir.listFiles(); //列出所有 的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFiles3(file,"|   "+space);
			}
			
		}
		
		
	}
	
	
	
	//列出一个文件夹的子孙文件与目录。
	public static void listFiles2(File dir,String space){ //space 存储的是空格
		File[] files = dir.listFiles(); //列出所有 的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFiles2(file,"  "+space);
			}
			
		}
		
		
	}
	
	
	
	
	//列出一个文件夹的子孙文件与目录。
	public static void listFiles1(File dir){
		File[] files = dir.listFiles(); //列出所有 的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println("文件名："+file.getName());
			}else if(file.isDirectory()){
				System.out.println("文件夹："+file.getName());
				listFiles1(file);
			}
			
		}
		
		
	}
	
}

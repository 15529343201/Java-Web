package cn.itcast.file;

import java.io.File;

/*
文件夹相关：
	staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
	list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
	listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。


	list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
	listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
*/
public class Demo6 {
	
	public static void main(String[] args) {
		/*File[] roots = File.listRoots(); //列出所有的根目录
		for(File file  : roots){
			System.out.println(file);
		}*/
		
		File file = new File("F:\\1208\\day17");
		
		/*
		String[] fileNames = file.list(); //把 当前文件夹下面的所有子文件名与子文件夹名 存储到一个String类型 的数组中 返回。
		for(String fileName : fileNames){
			System.out.println(fileName);
		}*/
		
		
		File[] files = file.listFiles(); // 把 当前文件夹下面的所有子文件与子文件夹都使用了一个FIle对象描述，然后把这些File对象存储到一个FIle数组中返回
		for(File fileItem : files){
			System.out.println("文件名："+ fileItem.getName());
		}
		
		
		
	}

}

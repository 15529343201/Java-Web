package cn.itcast.genrictiry;

import java.util.ArrayList;

//是老程序员写 的。  jdk1.4的时候写的。
public class MyUtil {
	
	public static ArrayList getList(){
		
		return new ArrayList();
	}
	
	public static void print(ArrayList list){
	
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	
}

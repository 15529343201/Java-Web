package cn.itcastset;

import java.util.Iterator;
import java.util.TreeSet;
/*
需求：将字符串中的数值进行排序。
		例如String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
*/

public class Demo8 {
	
	public static void main(String[] args) {
		String str="8 10 15 5 2 7";
		String[] datas = str.split(" ");
		
		TreeSet tree = new TreeSet();
		for(int i = 0 ; i<datas.length ; i++){
			tree.add(Integer.parseInt( datas[i])); // 字符串转int类型数据是需要使用Integer.parseInt()
		}
		
		//遍历treeSet的元素拼接成对应的字符串
		Iterator it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}

}

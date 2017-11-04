package cn.itcast.genrictiry;

import java.util.ArrayList;

/*
 需求： 编写一个数组 的工具类
 
 泛型类：
 
泛型类的定义格式：
	
	class 类名<声明自定义泛型>{
	
	}
 
泛型类要注意的事项：
 	1. 在类上自定义泛型的具体数据类型是在使用该类的时候创建对象时候确定的。
 	2. 如果一个类在类上已经声明了自定义泛型，如果使用该类创建对象 的时候没有指定 泛型的具体数据类型，那么默认为Object类型
 	3.在类上自定义泛型不能作用于静态的方法，如果静态的方法需要使用自定义泛型，那么需要在方法上自己声明使用。
 
 
 
 */

class MyArrays<T>{
	

	//元素翻转
	public void reverse(T[] arr){
		for(int startIndex = 0, endIndex = arr.length-1 ; startIndex<endIndex ; startIndex++,endIndex--){
			T temp  = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		
	}
	
	//
	public String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			if(i==0){
				sb.append("["+arr[i]+",");
			}else if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	
	
	public static <T>void print(T[] t){
		
	
		
	}
	
	
}



public class Demo3 {
	
	public static void main(String[] args) {
		Integer[] arr = {10,12,14,19};
		
		MyArrays<Integer> tool = new MyArrays<Integer>();
		tool.reverse(arr);
		System.out.println("数组的元素："+tool.toString(arr));
		
		MyArrays<String> tool2 = new MyArrays<String>();
		String[] arr2 = {"aaa","bbb","ccc"};
		tool2.reverse(arr2);
				
		
		ArrayList<String> list = new ArrayList<String>();
		
	}
	
}

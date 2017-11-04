/*
toString();
排序（sort）
找元素在数组中的位置(二分查找法)  binarySearch

数组的工具类（Arrays）：


作业1： 自定实现一个Arrays的toString方法。

*/
import java.util.*;
class Demo14 
{
	
	public static void main(String[] args) 
	{
		int[] arr = {12,3,1,10,8};
		//排序的方法
		Arrays.sort(arr);  
		String info = Arrays.toString(arr);
		System.out.println("数组的元素："+ info);

		// 1, 3, 8, 10, 12  
		int index = Arrays.binarySearch(arr,9);// 二分法查找 : 如果能在数组中找到对应 的元素，那么就返回该数据的索引值，如果没有找到那么就返回一个负数表示。
		System.out.println("找到的索引值："+ index);
		
	}
}

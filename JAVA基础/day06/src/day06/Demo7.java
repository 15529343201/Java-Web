package day06;

/*
需求： 目前存在数组：int[] arr = {0,0,12,1,0,4,6,0} ，编写一个函数
接收该数组，然后把该数组的0清空，然后返回一个不存在0元素的数组。

步骤：
	1. 计算机新数组的长度。  原来的数组长度-0的个数


*/
import java.util.*;
class Demo7 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,0,12,1,0,4,6,0};
		arr = clearZero(arr);
		System.out.println("数组的元素："+Arrays.toString(arr));
	}


	public static  int[] clearZero(int[] arr){
		//统计0的个数
		int count = 0;	//定义一个变量记录0的个数
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]==0){
				count++;
			}
		}

		//创建一个新的数组
		int[] newArr = new int[arr.length-count];
			
		int index  =0 ; //新数组使用的索引值
		//把非的数据存储到新数组中。
		for(int i = 0; i<arr.length ; i++){
			if(arr[i]!=0){
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}
}
/*
数组的元素：[12, 1, 4, 6]
*/

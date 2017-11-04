package cn.itcast.review;

import java.util.Arrays;

/*
 冒泡排序 ： 相邻的两个元素比较，符合条件交换 位置。
 
 */
 
public class Demo4 {

	public static void main(String[] args) {
		int[] arr = {2,5,10,8,1};  //所谓的排序就是将一个个的最大元素放在对应 的位置上。
		
		for(int j = 0 ; j<arr.length -1; j++){  // 控制的轮数，每一轮都可以找出一个最大值。
			//把最大值放在最后一个位置
			for(int i = 0 ; i<arr.length-1-j ; i++){  //控制的是相邻的两个元素比较。
				//相邻的两个元素比较
				if(arr[i] >arr[i+1]){
					int temp =arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
	/*	//把老二放在倒数第二个位置上
		for(int i = 0 ; i<arr.length-1-1 ; i++){
			//相邻的两个元素比较
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		//把老三放在倒数第三个位置上
		for(int i = 0 ; i<arr.length-1-2 ; i++){
			//相邻的两个元素比较
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		//把老四放在倒数第四个位置上
		for(int i = 0 ; i<arr.length-1-3 ; i++){
			//相邻的两个元素比较
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		*/
		
		System.out.println("数组的元素： "+Arrays.toString(arr));
		
		
		
	}

}

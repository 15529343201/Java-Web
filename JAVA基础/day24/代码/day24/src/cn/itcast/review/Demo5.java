package cn.itcast.review;
/*
 折半查找法(二分法) ：折半查找法使用的前提是数据必须 是有序的。
 
 */


public class Demo5 {

	public static void main(String[] args) {
		int[] arr = {12,15,17,19,30};
		int index = halfSearch(arr,0);
		System.out.println("idnex:"+ index);
	}
	
	public static int halfSearch(int[] arr,int target){
		int max = arr.length - 1;
		int min = 0;
		int mid = (max+min)/2;
		
		while(true){
			if(target>arr[mid]){
				min = mid+1;
			}else if(target<arr[mid]){
				max = mid-1;
			}else{
				return mid;
			}
			
			//重新计算中间值
			mid = (min+max)/2;
			
			//找不到
			if(max<min){
				return -1;
			}
			
		}
		
	}
	
}

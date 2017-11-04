/*
需求：定义一个函数接收一个数组对象和一个要查找的目标元素，函数要返回该目标元素在
数组中的索引值，如果目标元素不存在数组中，那么返回-1表示。


折半查找法(二分法): 使用前提必需是有序的数组。


*/
class Demo12 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,16,19,23,54};
		//int index = searchEle(arr,23);
		int index = halfSearch(arr,116);
		System.out.println("元素所在的索引值是："+ index);
	}
	
		
	public static int halfSearch(int[] arr, int target){
		//定义三个变量分别记录最大、最小、中间的查找范围索引值
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(true){
			if(target>arr[mid]){
				min = mid+1;
			}else if(target<arr[mid]){
				max = mid -1;
			}else{
				//找到了元素
				return mid;
			}

			//没有找到的情况
			if (max<min){
				return -1;
			}

			//重新计算中间索引值
			mid = (min+max)/2;
		}
	
	}



	
	public static int searchEle(int[] arr, int target){
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
}

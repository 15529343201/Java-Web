/*
需求： 定义一个函数接收一个int类型的数组对象, 把数组中的最大值放在数组中的最后一位。

冒泡排序：冒泡排序的思想就是使用相邻的两个 元素挨个比较一次，符合条件交换位置。

*/

class Demo10 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,8,17,5,9}; // 最大的索引值: 4   容量：5 
 		bubbleSort(arr);
	}


	public static void bubbleSort(int[] arr){
		// 把最大值放在最后一个位置
		for(int j = 0 ; j<arr.length-1 ; j++){ //控制轮数
			for(int i = 0 ; i<arr.length-1-j  ; i++){  // 找出一个最大值  
				//相邻的元素比较
				if(arr[i]>arr[i+1]){
					int temp  = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}

/*
	
		//把老二放在倒数第二个位置上。
		for(int i = 0 ;  i <arr.length-1-1 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

	
		//把老三放在倒数第三个位置上。
		for(int i = 0 ;  i <arr.length-1-2 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

		//把老四放在倒数第四个位置上。
		for(int i = 0 ;  i <arr.length-1-3 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

*/


		//遍历数组，查看效果
		System.out.print("目前的元素：");
		for (int i = 0 ; i<arr.length  ;i++){
			System.out.print(arr[i]+",");
		}
		
	}

}

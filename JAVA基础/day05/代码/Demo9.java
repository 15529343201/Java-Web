/*
需求： 定义一个函数接收一个int类型的数组对象, 把数组中的最大值放在数组中的第一位。

选择排序(直接排序)：使用一个元素与其他 的元素挨个比较一次，符合条件交换位置。


*/
class Demo9{
	
	public static void main(String[] args) 
	{
		int[] arr = {12,5,17,8,9};  //对于5元素的数组，只需要找出4个最大值就可以排序了。
		selectSort(arr);
	}

	public static void selectSort(int[] arr){
		
		//把最大值放在首位置。
		for(int j = 0; j<arr.length-1; j++){  //  控制的是轮数。
			for(int i = j+1 ; i<arr.length ; i++){ // 找出最大值
				if(arr[i]>arr[j]){
					//交换位置
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

/*
		//把老二放在第二个位置
		for(int i = 2  ; i< arr.length ; i++){
			if(arr[i]>arr[1]){
				int temp = arr[i];
				arr[i] = arr[1];
				arr[1] = temp;
			}
		}
		

		//把老三放在第三个位置
		for(int i = 3  ; i< arr.length ; i++){
			if(arr[i]>arr[2]){
				int temp = arr[i];
				arr[i] = arr[2];
				arr[2] = temp;
			}
		}

		//把老四放在第四个位置
		for(int i = 4  ; i< arr.length ; i++){
			if(arr[i]>arr[3]){
				int temp = arr[i];
				arr[i] = arr[3];
				arr[3] = temp;
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

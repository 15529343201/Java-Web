/*
需求： 定义一个函数接收一个int类型的数组对象，找出数组对象中 的最大元素返回给调用者。

*/

class Demo8 
{
	public static void main(String[] args) 
	{
		int[] arr = {-12,-14,-5,-26,-4};
		int max = getMax(arr);
		System.out.println("最大值："+ max); 
	}


	public static int  getMax(int[] arr){
		int max = arr[0]; //用于记录最大值
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i]>max){  //如果发现有元素比max大，那么max变量就记录该元素。
				max = arr[i];
			}
		}
		return max;
	}


}

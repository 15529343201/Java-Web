/* 
数组的初始化方式：
	
	动态初始化:
		数据类型[] 变量名 = new 数据类型[长度];

	静态初始化：	
		数据类型[] 变量名 = {元素1，元素2.....};


如果程序一开始你就已经确定了数据，那么这时候建议使用静态初始化。如果
数据一开始还不太明确，这时候就建议使用动态初始化。


*/
class Demo7 
{


	


	public static void main(String[] args) 
	{	
		//动态初始化
		//int[] arr = new int[10];
	
		//静态初始化
		int[] arr = {10,20,30,40,50};
		for(int index = 0 ; index<arr.length ; index++){
			 System.out.print(arr[index]+",");
		}


	/*
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		for(int i  = 0 ; i< arr.length ; i++){
			arr[i] = scanner.nextInt();
		}
		*/
	}
}

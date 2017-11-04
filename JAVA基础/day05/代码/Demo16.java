/*
静态初始化：

	数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}
*/
class Demo16 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{10,11,9},{67,12},{33,35,39,40}};
		//遍历二维数组
		for(int i = 0;  i <arr.length ; i++){
			for(int j = 0 ; j<arr[i].length ; j++){
				System.out.print(arr[i][j]+",");
			}
			//换行
			System.out.println();
		}
	}

	// 定义一个二维数组，然后计算二维数组中偶数元素的总和。
}

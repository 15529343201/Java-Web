/*

函数的定义格式：
	
	修饰符  返回值类型  函数名(形式参数..){
		需要被封装的功能代码；
		return 结果;
	}


如何定义一个函数：
	1. 返回值类型。
	2. 是否存在未知的参数(是否存在要由调用者确定的参数)。---->形式参数


*/

class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//int max = getMax(14,5); //调用了函数   实际参数
		//System.out.println("最大值："+ max);
		getMax(3,7);
	}
	
	//需求2：定义一个函数比较两个int类型的数据大小， 不需要把最大值返回给调用者,直接打印即可。
	public static void getMax(int a, int b){
		int max = 0; //定义一个变量用于保存最大值的
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		System.out.println("最大值："+ max);
	}

/*

	//需求1： 定义一个函数比较两个int类型的数据大小， 把最大值返回给调用者。
	public static int  getMax(int a, int b){  // 形式参数
		int max = 0; //定义一个变量用于保存最大值的
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		return max;	//把结果返回给调用者
	}
*/

}

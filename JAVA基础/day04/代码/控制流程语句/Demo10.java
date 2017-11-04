/*
需求： 使用do-while算出1-100之间偶数的总和。

*/
class Demo10 
{
	public static void main(String[] args) 
	{
		int num = 1;
		int sum = 0;	//定义一个变量用于保存每次相加的总和
		do{
			if(num%2==0){
				sum += num;
			}
			num++;
		}while(num<101);

		System.out.println("sum = "+ sum);
	}
}

/*
需求： 打印一个九九乘法表.

*/
class Demo15 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=9 ; i++){
			for(int j = 1 ; j<=i ; j++){ //控制列数 
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			//换行
			System.out.println();
		}
	}
}

/*
需求： 打印一个倒立的直角三角形。

*****
****
***
**
*

5行

列数会发生变化
					  j<(5-i)
	i= 0 ; i<5; j=0 ; j<5 ;	五个星号
	i = 1; i<5; j=0 ; j<4; 	四个星号
	i = 2; i<5; j=0 ; j<3; 	三个星号


*/

class Demo14 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i<5;  i++){
			for (int j = 0 ; j<(5-i)  ;j++ ){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
	}
}

/*
需求2： 实现猜数字游戏， 如果没有猜对可以继续输入你猜的数字，如果猜对了停止程序。

最多只能猜三次，如果还剩下最后一次机会的时候要提醒用户。

*/
import java.util.*;
class Demo8 {

	public static void main(String[] args) 
	{
		//创建一个随机数对象
		Random random = new Random();
		//调用随机数对象的nextInt方法产生一个随机数
		int randomNum = random.nextInt(10)+1; //要求随机数是 1~10
		//创建一个扫描器对象
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("请输入你要猜的数字:");
			//调用扫描器的nextInt方法扫描一个数字
			int guessNum = scanner.nextInt();
			if (guessNum>randomNum){
				System.out.println("猜大了..");
			}else if(guessNum<randomNum){
				System.out.println("猜小了..");	
			}else{
				System.out.println("恭喜你，猜对了`..");	
				break;
			}
		}
		
	}
}

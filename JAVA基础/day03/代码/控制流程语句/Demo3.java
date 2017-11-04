/*
需求： 键盘录入一个分数，根据分数输出对应的等级。

比如： 100-90  A等级    89-80  B等级 ..... E等级


接受键盘录入数据的步骤：
	1. 创建一个扫描器对象。
	2. 调用扫描器对象的nextInt方法扫描数据。
	3. 导入包。
*/
import java.util.*;
class Demo3 
{
	public static void main(String[] args) 
	{
	
		//创建一个扫描器
		Scanner scanner = new Scanner(System.in);
		//调用扫描器扫描键盘录入的数据
		
		System.out.println("请输入一个分数：");
		int score = scanner.nextInt(); //定义了一个num变量接收扫描到内容。
		
		if(score>=90&&score<=100){
			System.out.println("A等级");
		}else if(score>=80&&score<=89){

			System.out.println("B等级");
		}else if(score>=70&&score<=79){
			
			System.out.println("C等级");
		}else if(score>=60&&score<=69){
			
			System.out.println("D等级");
		}else if(score>=0&&score<=59){
			
			System.out.println("E等级");
		}else{
			System.out.println("补考..");
		}
		
	
	}
}

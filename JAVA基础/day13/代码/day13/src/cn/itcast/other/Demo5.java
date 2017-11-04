package cn.itcast.other;

import java.util.Random;
/*
随机数类
Random


需求： 编写一个函数随机产生四位的验证码。

 */

public class Demo5 {

	public static void main(String[] args) {
		/*
		Random random = new Random();
		int randomNum = random.nextInt(10)+1; //产生 的 随机数就是0-10之间
		System.out.println("随机数："+ randomNum);
		*/
		char[] arr = {'中','国','传','a','Q','f','B'};
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		//需要四个随机数，通过随机数获取字符数组中的字符，
		for(int i  = 0 ; i< 4 ; i++){
			int index = random.nextInt(arr.length);  //产生的 随机数必须是数组的索引值范围之内的。
			sb.append(arr[index]);
		}
		System.out.println("验证码："+ sb);
		
		
	}
	
}

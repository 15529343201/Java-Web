package cn.itcast.other;
/*
 递归：函数的自身调用函数的自身。
 
 递归的使用前提： 必须要有条件的情况下调用。
 
 
需求： 算出5的阶乘。 5! = 5*4 *3 * 2*1 
 
 
 */
public class Demo9 {

	public static void main(String[] args) {
		int result = print(5);
		System.out.println("结果："+ result);
	}
	
	public static int print(int num){
		if(num==1){
			return 1;
		}else{
			return num*print(num-1);
		}
	}
	
	
	
	
	public static int test(int num){
		int result  =  1;
		while(num>0){
			result = result*num;
			num--;
		}
		return result;
	}
}

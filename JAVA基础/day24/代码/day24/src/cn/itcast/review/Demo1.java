package cn.itcast.review;
/*
 三元运算符:
 
三元运算符的格式：
	 布尔表达式?值1:值2
 
教务系统

 	学生                          缴费
 				   1
 				   0
 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.matches("\\w{6}")?"正确":"错误");
		
		int a =3;
		System.out.println(3>a?"第一个":"第二个");
		
		int temp = 1;
		System.out.println(temp==1?"缴费":"未缴费");
		
		
	}
	

}

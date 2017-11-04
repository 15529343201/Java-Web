/*
算术运算符:
	+ (正数、加法、连接符)
	连接符的作用： 让任何的数据都可以与字符串进行拼接。
	如果+号用于字符串的时候，那么+号就是一个连接符，并不是 做加法功能了。

	连接符要注意：任何类型的数据与字符串使用连接符连接，那么结果都是字符串类型的数据。
	-
	*
	/ (除法)
	%(取模、取余数)



*/
class Demo3 {

	public static void main(String[] args){
/*	
		int i1 = 1; // 
		int i2 = 2;
		//System.out.println(i1 +" world");  // "hello wolrd" ，    1 world
		
		// 计算机每次运算的时候只能取两个 数据运算。
		System.out.println(1+2+3 +" world"+1+2+3); // 123world123   33world15

1+2+3 +" world"+1+2+3
  3+3 +" world"+1+2+3	
  6+" world"+1+2+3
   "6world"+1+2+3
		

		double a= 12.0;
		int b = 3;
		System.out.println(a/b); //3  4.0


		在java中做取模 运算的时，结果的正负号是取决于被除数。
*/	
		System.out.println("结果:"+(10%3));  // 1
		System.out.println("结果:"+(10%-3)); // 1      1
		System.out.println("结果:"+(-10%3)); // -1    -1 
		System.out.println("结果:"+(-10%-3)); //  -1  -1



	
	}
}

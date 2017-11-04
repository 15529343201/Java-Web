/*
控制流程语句之（if）判断语句

if判断语句的格式：
	
格式1：适用于一种情况使用。

	if(判断的条件){
		符合条件执行的代码;		
	}


格式2 : 适用于两种情况下去使用的。
	
	if(判断条件){
		符合条件执行的代码
	}else{
		不符合条件执行的代码；
	}


三元运算符的格式：布尔表达式？值1：值2;

if-else 与三元运算符非常像：

	三元运算符的优点： 结构比较简洁。
	
	三元运算符的缺点： 符合条件必须要返回一个结果，不能执行语句。



格式三： 适用于多种情况下去使用的。
	
	if(判断条件1){
		符合条件1执行的代码
	}else if(判断条件2){
		符合条件2执行的代码
	}else if(判断条件3){
		符合条件3执行的代码
	}......else{
		都不符合上述 的条件执行的代码	
	}



if语句要注意的细节：
	1. 如果符合条件后只有一个语句需要执行，那么可以省略大括号。但是建议不要省略，因为结构不清晰。
	2. if语句的判断条件后不能添加分号，否则会影响到执行的效果的，


需求1：工作经验要两年或者两年以上。

需求2：根据一个变量所记录的数字输出对应的星期。 0 ---星期天  1 星期一


*/
class Demo2 
{
	public static void main(String[] args) 
	{	
		
		int workAge = 2;
	
	/*
	格式1：
		if(workAge>=2){
			System.out.println("电话通知过来面试..");
		}
	
	格式2：
		
		if(workAge>=2){
			//符合条件执行的代码
			System.out.println("电话通知你面试");
		}else{
			//如果不符合上述的条件执行的代码
			System.out.println("电话通知不要再投简历了，不收你!!");
		}	
	*/
		
		int num = 31;
		
		if(num==0){
			System.out.println("星期天");
		}else if(num==1){
			System.out.println("星期一");
		}else if(num==2){
			System.out.println("星期二");
		}else if(num==3){
			System.out.println("星期三");
		}else if(num==4){
			System.out.println("星期四");
		}else if(num==5){
			System.out.println("星期五");
		}else if(num==6){
			System.out.println("星期六");
		}else{
			System.out.println("没有对应的星期");
		}

	}
}

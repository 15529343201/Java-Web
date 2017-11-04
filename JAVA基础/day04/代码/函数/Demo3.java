/*
需求1： 定义一个函数判断一个分数的等级，把分数的等级返回给调用者。
			"A等级" ”B等级“

如何 定义函数：
	1. 返回值类型。  String 
	2. 未知的参数--->形式参数。  分数


需求2： 定义一个函数打印一个乘法表，不需要返回任何数据。 
	1. 返回值类型。  void 
	2. 未知的参数--->形式参数。  到底是什么乘法表


函数的特点：
	1. 函数的作用就是把一个功能代码给封装起来，已达到提高功能代码的复用性。
	2. 函数定义好之后是需要被调用才会执行的。
	3. 如果一个函数没有返回值返回给调用者，那么返回值类型必须是使用void表示。

*/

class Demo3 
{
	public static void main(String[] args) {
		//String result = getGrade(189);
		//System.out.println(result);
		print(7);
	}


	//需求2： 定义一个函数打印一个乘法表，不需要返回任何数据。 
	public static void  print(int row){
		for(int i = 1 ; i<= row ; i++){
			for (int j = 1 ;j<=i  ;j++ ){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			//换行
			System.out.println();
		}
	}




	//需求1： 定义一个函数判断一个分数的等级，把分数的等级返回给调用者。
	public static String getGrade(int score){
		String grade = "";	//定义一个变量存储等级
		if(score>=90&&score<=100){
			grade = "A等级";
		}else if(score>=80&&score<=89){
			grade = "B等级";
		}else if(score>=70&&score<=79){
			grade = "C等级";
		}else if(score>=60&&score<=69){
			grade = "D等级";
		}else if(score>=0&&score<=59){
			grade = "E等级";
		}else{
			grade = "补考等级";
		}
		return grade;	//把等级返回给调用者
	}
	
}

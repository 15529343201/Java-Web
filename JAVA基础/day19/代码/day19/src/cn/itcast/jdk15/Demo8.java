package cn.itcast.jdk15;
/*
 switch适用的数据类型： byte \ char \short \ int \ String\枚举类型
 
 注意： 
 	case语句后面跟的枚举值，只需要单写枚举值即可，不需要再声明该 枚举值是属于哪个枚举类的。
 	
 
 
 */

//季节枚举类
enum Season{
	spring,summer,autumn,winter;
}

enum Person2{
	student,worker;
}


public eclass Demo8 {
	
	public static void main(String[] args) {
		Season season = Season.summer;
		switch(season){
			case spring:
				System.out.println("春天...");
				break;
			case summer:
				System.out.println("夏天...");
				break;
			case autumn:
				System.out.println("秋天...");
				break;
			case winter:
				System.out.println("冬天...");
				break;		
		}
		
		
		
		
		
	}
}

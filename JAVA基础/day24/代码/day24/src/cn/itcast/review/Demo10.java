package cn.itcast.review;
/*
 instanceof  判断指定的对象是否属于某种类别。
 
 instanceof 使用前提： 判断的对象与类别必须存在继承或者实现的关系。
  
 instanceof 使用格式：
 		对象 instanceof 类别。
 
 有多态才可能使用到instanceof关键字，
 
 主要的应用场景： 数据类型强转之前的判断。
 
 */
class Fish extends Animal{
	
}

class  Mouse extends Animal{}


public class Demo10 {

	public static void main(String[] args) {
		/*Fish f = new Fish();
		Animal a = new Animal();
		System.out.println("鱼是属于动物类吗？"+  (f instanceof Animal));
		System.out.println("鱼是属于老鼠吗?"+ (a instanceof Fish));*/
		
		Animal a = getAnimal(1);
		if(a instanceof Fish){			
			Fish f =(Fish) a;
		}else if(a instanceof Mouse){
			Mouse m = (Mouse)a;
		}
		
	}
	
	
	public static Animal getAnimal(int i){
		if(i==0){
			return new Fish();
		}else{
			return new Mouse();
		}
	}
	
	
}

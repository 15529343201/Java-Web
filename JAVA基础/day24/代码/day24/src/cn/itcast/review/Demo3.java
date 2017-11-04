package cn.itcast.review;
/*
 函数的重载: 在一个类中出现了两个 或两个以上 的同名函数称作为函数的重载。
 
 函数重载的作用： 一个函数名可以应对各种不同类型的参数。
 
函数重载的要求
	1. 函数名一致。
	2. 形参列表不一致（形参的个数不一致或者是形参对应 的类型不一致）
	3. 与返回值类型无关。
	

函数重写：子父类出现了同名的函数称作为函数的重写。

函数重写必须要是在继承的关系才存在的。

函数重写的需求： 父类的功能无法满足子类的需求。

函数重写的要求
	1. 子父类的函数名与形参列表必须一致。
	2. 子类的权限修饰符必须 要大于或者等于父类的权限修饰符。
	3. 子类的返回值类型必须要小于或者等于父类的返回类型。
	4. 子类抛出的异常类型必须要小于或者等于父类抛出的异常类型。
	

 */

class Animal{
}

class Cat extends Animal{}

class Fu{
	
	public Animal eat(int num){
		System.out.println("父类的eat方法");
		return new Animal();
	}
	
}

class Zi extends Fu{
	
	public Animal eat(int num){
		System.out.println("子类的eat方法..");
		return new Animal();
	}
}



public class Demo3 {

	public static void main(String[] args) {
		/*int[] arr = {1,2,4};
		double[] arr2 = {2.14,3.14,5.0};
		sort(arr);
		sort(arr2);*/
		
		Zi z = new Zi();
		z.eat(11);
		
		
	}
	
	public static void sort(int[] arr){
		for(int i = 0 ; i< arr.length-1; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}
	
	
	public static void sort(double[] arr){
		for(int i = 0 ; i< arr.length-1; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}
	
	
}

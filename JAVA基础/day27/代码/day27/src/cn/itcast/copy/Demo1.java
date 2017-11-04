package cn.itcast.copy;
/*
 对象的克隆
 	
 	对象的浅克隆:
 	
 	对象浅克隆要注意的细节： 
 		1. 如果一个对象需要调用clone的方法克隆，那么该对象所属的类必须要实现Cloneable接口。
 		2. Cloneable接口只不过是一个标识接口而已，没有任何方法。
 		3. 对象的浅克隆就是克隆一个对象的时候，如果被克隆的对象中维护了另外一个类的对象，这时候只是克隆另外一个对象的地址，而没有把
 		另外一个对象也克隆一份。
 		4. 对象的浅克隆也不会调用到构造方法的。
 		
 	对象的深克隆：

 */
public class Demo1 {
	
	
	public static void main(String[] args) throws Exception {
		Address address = new Address("广州");
		Person p1 = new Person(110,"狗娃",address);
		Person p2 = (Person) p1.clone(); //clone() 克隆了一个对象。
		
		p2.name = "狗剩";
		p2.address.city ="长沙";
		System.out.println("p1:"+p1);
		System.out.println("p2:"+ p2);
		
		
		
	}

}

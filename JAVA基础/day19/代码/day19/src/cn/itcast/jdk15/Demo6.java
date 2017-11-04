package cn.itcast.jdk15;
/*
 jdk1.5新特性之-----枚举
 
 问题：某些方法所接收的数据必须是在固定范围之内的， 
 
解决方案： 这时候我们的解决方案就是自定义一个类,然后是私有化构造函数，在自定义类中创建本类的对象对外使用。

jdk1.5对以上问题提出了新的解决方案： 就是使用枚举类解决。

一些方法在运行时，它需要的数据不能是任意的，而必须是一定范围内的值，Java5以后可以直接使用枚举予以解决。
 	比如： 方向 , 性别 、 季节 、 星期......
 
 
 */

/*
//自定义一个性别类
class Gender{
	
	String value;
	
	public static final Gender man = new Gender("男");
	
	public static final Gender woman = new Gender("女");
	

	private Gender(String value) {
		this.value = value;
	}
}
*/
enum Gender{
	man("男"),woman("女");
	
	String value;
	
	private Gender(String value){
		this.value = value;
	}
}


class Person{
	
	private String name;
	
	private	Gender sex;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}		
}

public class Demo6 {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("狗娃");
		p.setSex(Gender.woman);
		System.out.println("名字："+ p.getName()+" 性别："+ p.getSex().value);
		
	}
	
}

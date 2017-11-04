package cn.itcast.copy;

import java.io.Serializable;

class Address implements Serializable{
	
	String city;
		
	public Address(String city){
		this.city = city;
	}
	
}



public class Person implements Cloneable,Serializable {
	
	int id;
	
	String name;
	
	Address address;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	
	
	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("=======构造方法调用了===");
	}




	@Override
	public String toString() {
		return "编号："+ this.id+" 姓名："+ this.name+" 地址："+ address.city;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}

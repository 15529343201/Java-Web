package cn.itcast.review;

class Person{

	int id;
	
	String name;

	@Override
	public String toString() {
		return "±àºÅ£º"+this.id+" ÐÕÃû£º"+this.name;
	}
	
}

public class Demo6 {
	
	public static void main(String[] args) {
		Person p  = new Person();
		p.id= 110;
		p.name = "¹·ÍÞ";
				
		System.out.println(p);
		
	}
	
}

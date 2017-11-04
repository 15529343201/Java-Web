package cn.itcast.review;
/*
构造代码块：给对象进行统一的初始化工作。

应用场景： 如何创建任意对象的时候都需要调用某个方法为该对象进行初始化时，这时候就可以使用构造代码块。

静态代码块:

静态代码块是静态代码块所属的类被加载到内存的时候执行的。


静态代码块的应用场景： 以后主要用于准备一个项目的初始化工作。 
	比如： 从配置配置文件中读取数据库用户名与密码。


 */

class Baby{
	
	int id;
	
	String name;
	
	//构造代码块的代码其实是在构造函数中执行的。	
	{
		
		cry();
	}
	
	static{
		System.out.println("静态代码块执行了...");
	}

	public Baby(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Baby(){
		
	}
	
	public void cry(){
		System.out.println("哭...");
	}
	
	@Override
	public String toString() {
		return " 编号："+this.id+" 姓名："+ this.name;
	} 
}




public class Demo9 {
	
	public static void main(String[] args) {
		Baby b1 = new Baby();
		Baby b2 = new Baby(110, "狗娃");
	}

}
	
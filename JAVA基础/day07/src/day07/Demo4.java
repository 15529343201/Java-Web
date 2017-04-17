package day07;

/*
构造代码块：

构造代码块的作用：给对象进行统一的初始化。

构造函数的作用： 给对应的对象进行初始化。


构造代码块的格式：
	
	{
		构造代码块
	}

注意： 构造代码块的大括号必须位于成员 位置上。


代码块的类别：
	1. 构造代码块。
	2. 局部代码块.   大括号位于方法之内。  作用：缩短局部 变量 的生命周期，节省一点点内存。
	3. 静态代码块  static 
*/

class Baby{
	
	int id; //身份证
 
	String  name;  //名字
	
	//构造代码块...
	{
		//System.out.println("构造代码块的代码执行了......");
		cry();
		
	}

	//带参构造函数
	public  Baby(int i , String n){
		id  = i;
		name = n;
	}
	
	//无参构造方法
	public Baby(){
	}

	public void cry(){
		System.out.println(name+"哇哇哭...");
	}	
}



class Demo4 
{
	public static void main(String[] args) 
	{
		Baby b1 = new Baby(110,"狗娃");  //  狗娃 狗剩 铁蛋
		System.out.println("编号："+ b1.id + " 名字："+b1.name);
		/*
		System.out.println("编号："+ b1.id + " 名字："+b1.name);
	
		new Baby(112,"狗剩");
		new Baby();
		*/
		/*
		new Baby(110,"狗娃");
		new Baby(112,"狗剩");
		new Baby();
		*/
	}
}
/*
null哇哇哭...
编号：110 名字：狗娃
*/
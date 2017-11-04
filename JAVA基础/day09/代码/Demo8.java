
/*
接口的作用：
	1. 程序的解耦。  （低耦合）
	2. 定义约束规范。
	3. 拓展功能。


*/

//普通的铅笔类
class Pencil{
	
	String name;

	public Pencil(String name){
		this.name = name;
	}

	public void write(){
		System.out.println(name+"沙沙的写...");
	}
}


//橡皮接口
interface Eraser{
	
	public void remove();
}


//带橡皮的铅笔
class PencilWithEraser extends Pencil implements Eraser {

	public PencilWithEraser(String name){
		super(name);
	}


	public void remove(){
		System.out.println("涂改,涂改....");
	}
}


class Demo8 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		PencilWithEraser p = new PencilWithEraser("2B铅笔");
		p.write();
		p.remove();
	
	}
}


//实现关系下匿名内部类
interface Dao{

	public void add();
}


class Outer{

	public void print(){
		//创建一个匿名内部类的对象
		new Dao(){   //不是接口不能创建对象吗？怎么现在又可以了？
			 
			 public void add(){
				System.out.println("添加成功");
			 }
		}.add();
	}
}



class Demo7 
{
	public static void main(String[] args) 
	{
		test(new Dao(){
			
			public void add(){
				System.out.println("添加员工成功");
			}
		});


	}

	//调用这个方法...
	public static void  test(Dao d){  //形参类型是一个接口引用..
		d.add();
	}
}

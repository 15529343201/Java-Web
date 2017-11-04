/*
多态： 父类的引用类型变量指向了子类的对象或者是接口类型的引用类型变量指向了接口实现类 的对象。

实现关系下的多态：
	
	接口  变量  = new  接口实现类的对象。
*/

interface Dao{  //接口的方法全部都是非静态的方法。

	public void add();

	public void delete();
}



//接口的实现类
class UserDao implements Dao{
	
	public void add(){
		System.out.println("添加员工成功！！");
	}

	public void delete(){
		System.out.println("删除员工成功！！");
	}

}

class Demo3 
{
	public static void main(String[] args) 
	{
		//实现关系下的多态
		Dao d = new UserDao(); //接口的引用类型变量指向了接口实现类的对象。
		d.add();


	}
}

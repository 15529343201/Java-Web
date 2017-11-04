package cn.itcast.review;
/*
封装：

封装的步骤：
	1. 私有化要封装的属性。
	2. 根据需求提供对应的get或者是set方法。

 封装的好处：
 	1. 提高数据的安全性。
 	2. 操作简单。
 	3。 隐藏实现。
 	
封装一定会用的场景：如果是实体类的成员属性，我们在现实开发中全部都封装起来。

 */
class Member{
	
	private String name;
	
	private String sex;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex){
		if("男".equals(sex)||"女".equals(sex)){
			this.sex = sex;
		}
	}
	
	public String getSex(){
		
		return sex;
	}
	
	
}
public class Demo8 {
	
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("狗娃");
		m.setSex("男");
	}
}

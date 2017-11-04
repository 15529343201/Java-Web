package cn.itcast.review;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
匿名对象：没有引用类型变量指向的对象就称作为匿名对象。

匿名内部类：没有类名的类就称作为匿名内部类。

匿名内部类使用前提： 必须存在继承或者实现关系。

因为匿名内部类没有类名，所以创建匿名内部类对象的时候就必须要借助与它父类的名字或者它父接口的名字来创建。 
但是匿名内部类只不过是没有类名，其他的一概成员都是具备的。


匿名内部类的应用场景： 主要是作为参数传递使用。

 */

interface Dao{
	
	public void add();
}

class Outer{
	
	public void print(){
		new Dao(){ //这里不是创建接口 的对象，是创建了Dao实现类的对象，但是这个类是一个匿名内部类而已，没有类名借用了父接口 的名字而已。
			//大括号中就写匿名内部类的成员。
			int  num =10;
			
			@Override
			public void add() {
				System.out.println("添加学生 ..");
			}
		}.add();
		
	}
}




public class Demo13 {

	public static void main(String[] args) {
		
		/*Outer outer = new Outer();
		outer.print();*/
		
		JButton button = new JButton("aa");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aaa");
				
			}
		});
		
		
	}
	
}

package cn.itcast.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
 布局管理器:布局管理就是用于指定组件的 摆放位置的。
 
每种布局管理器都有自己的摆放风格 
 
BorderLayout(边框布局管理器)

	摆放的风格： 上北  、 下南 、 左西、 右东 ， 中 

Borderlayout 要注意的事项：
	1. 使用Borderlayout添加组件的时候，如果没有指定组件的方位，那么默认添加到中间的位置上。
	2. 使用BorderLayout的时候，如果东南西北那个方向没有对应 的组件，那么中间位置的组件就会占据其空缺的位置。
	3. 窗体默认的布局管理器就是Borderlayout.
	
 */
public class Demo1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("边框局部管理器");
		//创建一个边框布局管理器
		BorderLayout borderLayout = new BorderLayout();
		//让borderlayout管理frame窗体。
		frame.setLayout(borderLayout);
		
		frame.add(new JButton("北"),BorderLayout.NORTH);
		frame.add(new JButton("南"),BorderLayout.SOUTH);
		frame.add(new JButton("西"),BorderLayout.WEST);
		frame.add(new JButton("东"),BorderLayout.EAST);
		frame.add(new JButton("中"),BorderLayout.CENTER);
		//初始化窗体
		FrameUtil.initFrame(frame, 300, 300);
	}
	
}

package cn.itcast.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
 表格布局管理器(GridLayout)
 
 注意的事项： 如果表格数量不够使用时，默认会多加一列。
 
 
 */
public class Demo3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("计算器");
		//创建表格布局管理器
		GridLayout gridLayout = new GridLayout(4, 4, 1, 2);
		
		//让窗体交给表格布局管理器管理
		frame.setLayout(gridLayout);
		for(int i = 0 ; i<10; i++){
			frame.add(new JButton(i+""));
		}
		frame.add(new JButton("+"));
		frame.add(new JButton("-"));
		frame.add(new JButton("*"));
		frame.add(new JButton("/"));
		frame.add(new JButton("="));
		frame.add(new JButton("."));
		
//		frame.add(new JButton("aa"));
		
		//初始化窗体
		FrameUtil.initFrame(frame, 300, 300);
		
		
		
	}
	
}

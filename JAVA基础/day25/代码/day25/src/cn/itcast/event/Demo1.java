package cn.itcast.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 事件： 当发生了某个事件的时候，就会有相应处理方案。
 
 
 	事件源         监听器            事件            处理方案
 
 */



import cn.itcast.util.FrameUtil;


public class Demo1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		JButton button = new JButton("点我啊");
		frame.add(button);
		//给按钮添加动作监听器     动作时间监听器对于鼠标点击以及空格键都会起作用的。
		button.addActionListener(new ActionListener() {
			
			//当按钮被点击的时候，就会调用actionPerformed的方法。 
			@Override
			public void actionPerformed(ActionEvent e) {  // ActionEvent 当前按钮被点击的时候，jvm就会把对应 的时间传递ActionEvent，并且调用actionPerformed方法。
				//System.out.println("哎呀，被点了...");
				JButton button =(JButton) e.getSource(); //getSource() 获取到事件源
				if(button.getText().equals("点我啊")){
					button.setText("点他吧");
				}else{
					button.setText("点我啊");
				}
				
			}
		});
		
		
		
		FrameUtil.initFrame(frame, 200, 200);
		
		
		
	}
	
	
}

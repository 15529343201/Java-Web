package cn.itcast.layout;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.itcast.util.FrameUtil;

/*
卡片布局管理器(CardLayout)
 */


public class Demo4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("卡片布局管理器");
		final JPanel panel = new JPanel();
		frame.add(panel);
		
		//创建一个卡片布局管理器
		final CardLayout cardLayout = new CardLayout();
		panel.setLayout(cardLayout);
		
		//往面板添加数据
		JButton button = new JButton("黑桃A");
		panel.add(button);
		panel.add(new JButton("红桃K"));
		panel.add(new JButton("梅花6"));
		panel.add(new JButton("方块2"));
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panel);  //下一张
//				cardLayout.previous(parent);  上一张
			}
		});
		
		
		//初始化窗体
		FrameUtil.initFrame(frame,300, 300);
		
		
		
		
		
		
	}
	
}

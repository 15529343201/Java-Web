package cn.itcast.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
 键盘事件监听器
 
 */
public class Demo3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("键盘事件监听器");
		JButton button = new JButton("按钮");
		frame.add(button);
		//给按钮添加键盘事件监听器
		/*button.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("键入某个键");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
//				System.out.println("释放某个键");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("按下某个键..");
			}
		});*/
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
//				System.out.println("按下的字符："+e.getKeyChar());
				//System.out.println("获取键对应的数值："+ e.getKeyCode());
				int code = e.getKeyCode();
				switch (code) {
				case 38:
					System.out.println("上");
					break;
				case 40:
					System.out.println("下");
					break;
				case 37:
					System.out.println("左");
					break;
				case 39:
					System.out.println("右");
					break;
				default:
					break;
				}
			}
		});
		
		
		FrameUtil.initFrame(frame,300, 300);
		
		
	}
	
}

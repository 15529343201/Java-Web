package cn.itcast.frame;

import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cn.itcast.util.FrameUtil;

/*
 对话框类(Dialog):
 
 	JDialog(Dialog owner, String title, boolean modal) 
 	
 	owner: 所有者
 	
 	title : 标题
 	
 	modal : modal
 
JOptionPane(对话框)
	消息对话框
	警告对话框
	错误对话框
	输入对话框
	确认对话框
	

 
 */
public class Demo2 {

	public static void main(String[] args) {
		/*JFrame frame = new JFrame("窗体");
		//创建对话框
		JDialog dialog = new JDialog(frame, "对话框",true);
		//使用我自定义的 窗体工具类
		FrameUtil.initFrame(frame, 300, 400);
		
		dialog.setBounds(500,300, 100, 200);
		dialog.setVisible(true); //设置对话框的可见性
*/		
		
		JFrame frame = new JFrame("窗体");
		//显示一个对话框
		FrameUtil.initFrame(frame, 300, 400);
		//消息对话框
		/*JOptionPane.showMessageDialog(frame, "明天不用上课", "通知",JOptionPane.INFORMATION_MESSAGE);
		//警告对话框
		JOptionPane.showMessageDialog(frame,"警告某位同学晚上晚自习不要看动漫","警告",JOptionPane.WARNING_MESSAGE);*/
		//错误对话框
//		JOptionPane.showMessageDialog(frame,"扣6分","错误",JOptionPane.ERROR_MESSAGE);
		
		//输入框
	/*	String moeny = JOptionPane.showInputDialog("请输入你要给我的金额($)");
		System.out.println("money:"+ moeny);*/
		
		//确认框
		int num = JOptionPane.showConfirmDialog(frame, "你确认要卸载吗？");
		System.out.println(num);
	}
	
}

package cn.itcast.compnent;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/*
 菜单组件
 	
 	菜单条(MenuBar) 、  菜单（Menu） 、 菜单项(MenuItem)
 	
 	菜单条可以添加菜单
 	
 	菜单可以添加菜单项
 	
 	复选菜单：
 		首先菜单添加菜单 ， 菜单添加菜单项。
 	
 	
 */
import javax.swing.JTextArea;

import cn.itcast.util.FrameUtil;


public class Demo2 {
	
	JFrame frame = new JFrame("记事本");
	
	//菜单条
	JMenuBar bar = new JMenuBar();
	
	//文件菜单
	JMenu fileMenu = new JMenu("文件");
	JMenu editMenu  = new JMenu("编辑");
	
	JMenu switchMenu = new JMenu("切换工作目录");
	
	
	//菜单项
	JMenuItem openMenu = new JMenuItem("打开");
	JMenuItem saveMenu = new JMenuItem("保存");
 
	JMenuItem aboutMenu = new JMenuItem("关于");
	JMenuItem closeMenu = new JMenuItem("关闭");
	
	
	JMenuItem  workMenu1 = new JMenuItem("0910project");
	JMenuItem  workMenu2 = new JMenuItem("1208project");
	JMenuItem  workMenu3 = new JMenuItem("1110project");
	
	
	
	JTextArea area = new JTextArea(20,30);
	
	public void initNotepad(){
		//菜单添加菜单项目
		fileMenu.add(openMenu);
		fileMenu.add(saveMenu);
		
		editMenu.add(aboutMenu);
		editMenu.add(closeMenu);
		
		//复选菜单
		switchMenu.add(workMenu1);
		switchMenu.add(workMenu2);
		switchMenu.add(workMenu3);
		//菜单添加菜单就是复选菜单
		fileMenu.add(switchMenu);
		
		
		
		//菜单条添加菜单
		bar.add(fileMenu);
		bar.add(editMenu);
		
		//添加菜单条
		frame.add(bar,BorderLayout.NORTH);
		frame.add(area);
		FrameUtil.initFrame(frame, 500, 600);
	}
	
	public static void main(String[] args) {
		new Demo2().initNotepad();
	}
	
	
}

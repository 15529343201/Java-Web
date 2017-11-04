package cn.com.mysnake;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 * 
 * @author ccq
 * 贪食蛇的画布
 *
 */
public class SnakeJPanel extends javax.swing.JPanel implements KeyListener
{
	public static final int STARTPOINT_X = 20;//内框开始点X
	public static final int STARTPOINT_Y = 10;//内框开始点Y
	public static final int SIZE_X = 580; //内框长度
	public static final int SIZE_Y = 320; //内框高度
	public static final int BOX_GAP = 10; //方框间隙
	public static final int SPEED = 500; //蛇自动运行速度
	
	public static boolean isGameStart = false;//游戏状态标识
	public static boolean isMorePerson =false;//多人游戏标记
	
	private static SnakeFood food;//食物
	private static Snake snake;//蛇
	private static LinkedList<Snake> netSnakelist; //控制网络蛇的集合
	private SnakeMoveThread snakeMoveThread;//蛇自动运行线程
	private JList jScoreList;//列表框

	public Color boxColor;//框的颜色
	public Color boxLowColor;//框底部的颜色
	
	private SnakeServer snakeServer;//服务器
	private SnakeClient snakeClient;//客户端
	
	private UdpThread udpThread;
	private Properties pro;//配置文件
	private LinkedList<String> scoreList;
	
	public SnakeJPanel()
	{
		super();
		initGUI();
		
		scoreList = new LinkedList<String>();
		
		//配置文件
		pro = new Properties();
		try {
			File file = new File(".\\snake.config");
			if(!file.exists())//如果配置文件不存在
			{
				pro.setProperty("name","user");
				pro.store(new FileWriter(file), "snake");
			}
			else
			{
				pro.load(new FileReader(file));	
			}
		} catch (IOException e) {
			System.out.println("文件读取异常");
		}
		
		this.addKeyListener(this);//添加键盘事件监听
		food = new SnakeFood();//创建食物
		
		//创建蛇
		try {
			snake = new Snake(InetAddress.getLocalHost().toString(),pro.getProperty("name"));//蛇名字需要从配置中读取
		} catch (UnknownHostException e) {
			System.out.println("系统网卡有问题");
		}
		//创建网路蛇控制链表
		netSnakelist = new LinkedList<Snake>();
		
		boxColor = new Color(0,0,0);
		boxLowColor = new Color(176,213,210);
		//开启蛇自动运行线程
		snakeMoveThread = new SnakeMoveThread(this,SPEED);
		snakeMoveThread.start();
		//开启udp线程
		udpThread = new UdpThread();
		udpThread.start();
	}
	//获取服务器
	public SnakeServer getServer()
	{
		return this.snakeServer;
	}
	//开启服务器线程
	public void startMorePersonGameServerThread()
	{
		snakeServer = new SnakeServer(this);
		snakeServer.start();
	}
	//获取客户端
	public SnakeClient getClient()
	{
		return this.snakeClient;
	}
	//开启客户端线程
	public void startMorePersonGameClientThread(String serverIP)
	{
		snakeClient = new SnakeClient(this,serverIP);
		snakeClient.start();
	}
	
	
	//界面初始化
	private void initGUI()
	{
		try {
			this.setPreferredSize(new java.awt.Dimension(620, 440));
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setSize(620, 440);
			{
				ListModel scoreListModel = new DefaultComboBoxModel();
				jScoreList = new JList();
				JScrollPane scrollPane = new JScrollPane(jScoreList);
				this.add(scrollPane, new AnchorConstraint(785, 1000, 1001, 0, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jScoreList.setModel(scoreListModel);
				jScoreList.setPreferredSize(new java.awt.Dimension(620, 95));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//边框绘制
	public void paintBox(Graphics g)
	{
		
		//绘制格子的底层颜色
		g.setColor(boxLowColor);//设置颜色
		g.fill3DRect(STARTPOINT_X,STARTPOINT_Y,SIZE_X,SIZE_Y,true);
		
		//绘制外框
		g.setColor(this.boxColor);//设置颜色
		g.drawRect(STARTPOINT_X-BOX_GAP, STARTPOINT_Y-BOX_GAP, SIZE_X+BOX_GAP*2,SIZE_Y+BOX_GAP*2);
		g.drawRect(STARTPOINT_X, STARTPOINT_Y,SIZE_X,SIZE_Y);
		
		//绘制横格
		for(int i = 0 ; i < SIZE_Y/SnakeBody.SIZE;i ++)
		{
			g.drawLine(STARTPOINT_X,STARTPOINT_Y+SnakeBody.SIZE*(i+1),SIZE_X+SnakeBody.SIZE,STARTPOINT_Y+SnakeBody.SIZE*(i+1));
		}
		
		//绘制竖格
		for(int i = 0 ; i < SIZE_X/SnakeBody.SIZE;i ++)
		{
			g.drawLine(STARTPOINT_X+SnakeBody.SIZE*(i+1),STARTPOINT_Y,STARTPOINT_X+SnakeBody.SIZE*(i+1),SIZE_Y+SnakeBody.SIZE/2);
		}
	}
	
	//创建新的食物
	public void createFood()
	{
		food.crateFood();
	}
	
	//绘制新的食物
	public void drawFood(Graphics g)
	{
		if(!this.isMorePerson)
		{
			//绘制的食物在蛇身上则重新生成食物
			while(this.snake.getList().contains(new SnakeBody(food.getX(), food.getY())))
			{
				this.createFood();
			}
		}
		else if(this.snake.getIsServerSnake())//在多人游戏中绘制的食物在蛇身上则重新生成食物
		{	
			//绘制的食物在蛇身上则重新生成食物
			while(this.snake.getList().contains(new SnakeBody(food.getX(), food.getY())))
			{
				this.createFood();
			}
			
			for(Snake temp:netSnakelist)
			{
				while(temp.getList().contains(new SnakeBody(food.getX(), food.getY())))
				{
					this.createFood();
				}
			}
		}
		//绘制
		g.setColor(food.foodColor);//设置颜色
		g.fill3DRect(food.getX()*SnakeFood.FOODSIZE + STARTPOINT_X,food.getY()*SnakeFood.FOODSIZE + STARTPOINT_Y,SnakeFood.FOODSIZE,SnakeFood.FOODSIZE,true);
	}
	public static SnakeFood getFood()
	{
		return food;
	}
	public static Snake getSnake()
	{
		return snake;
	}
	//创建蛇
	public void createSnake(int x,int y)
	{
		//snake = new Snake();	
		snake.recreat(x,y);
	}
	//绘制单条蛇
	public void drawSingleSnake(Snake snake,Graphics g)
	{
		if(snake.getState())
		{
			LinkedList<SnakeBody> list = snake.getList();
			//绘制蛇身
			g.setColor(snake.snakeColor); //设置颜色
			for(int i = 1; i < list.size(); i++)
			{	
				g.fill3DRect(list.get(i).getX()*SnakeBody.SIZE + STARTPOINT_X,list.get(i).getY()*SnakeBody.SIZE + STARTPOINT_Y,SnakeBody.SIZE,SnakeBody.SIZE,true);
			}
			//绘制蛇头
			g.setColor(snake.snakeHeadColor); //设置颜色
			g.fill3DRect(list.get(0).getX()*SnakeBody.SIZE + STARTPOINT_X,list.get(0).getY()*SnakeBody.SIZE + STARTPOINT_Y,SnakeBody.SIZE,SnakeBody.SIZE,true);
		}
	}
	
	//绘制蛇
	public void drawSnake(Graphics g)
	{
		drawSingleSnake(this.snake,g);
		//如果是多人游戏
		if(this.isMorePerson)
		{
			for(int i = 0 ; i < netSnakelist.size() ; i++)
			{
				drawSingleSnake(netSnakelist.get(i),g);
			}
		}
	}
	
	//界面更新
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		paintBox(g);
		
		if(this.isGameStart)
		{
			//设置当前控件为焦点
			this.requestFocus(true);
			
			drawFood(g);//绘制食物		
			drawSnake(g);//绘制蛇
			updateScore();//更新成绩
		}
	}

	public void startGame()
	{
		//清空蛇的成绩
		this.snake.setScore(0);
		//清空链表
		this.netSnakelist.clear();
		//创建食物
		this.createFood();
		//创建蛇
		this.createSnake(10,10);
		//改变游戏开始标识
		snake.setState(true);
		this.isGameStart = true;
		this.isMorePerson = false;
		
		//重新绘制界面
		this.repaint();
		
		System.out.println("游戏开始");
	}
	
	//开始多人游戏
	public void startMorePersonGame()
	{		
		//清空蛇的成绩
		this.snake.setScore(0);
		//清空链表
		this.netSnakelist.clear();
		//创建食物
		this.createFood();
		//创建蛇
		this.createSnake(10,10);
		
		snake.setState(true);
		//游戏开始标志
		isGameStart = true;
		//多人游戏标志
		isMorePerson = true;
		
		//重新绘制界面
		this.repaint();
				
		System.out.println("游戏开始");
	}
	//获取网络蛇控制链表
	public static LinkedList<Snake> getList()
	{
		return netSnakelist;
	}
	
	//更新成绩
	public void updateScore()
	{
		scoreList.clear();
		scoreList.add(this.snake.getName()+" 分数:"+this.snake.getScore());
		
		for(Snake temp : this.netSnakelist)
		{
			scoreList.add(temp.getName()+" 分数:"+temp.getScore());
		}
		
		//ListModel GameListModel = new DefaultComboBoxModel(set.toArray());
		jScoreList.setListData(scoreList.toArray());
	}
	
	
	//键盘监听 接口KeyListener的实现方法
	public void keyPressed(KeyEvent e)
	{
		if(this.snake.getState())
		{
			switch (e.getKeyCode())
			{
				case KeyEvent.VK_UP: //按上键
				{
					snake.move(0,-1);
					break;
				}
				case KeyEvent.VK_DOWN: //按下键
				{
					snake.move(0,1);
					break;
				}
				case KeyEvent.VK_LEFT: //按左键
				{
					snake.move(-1,0);
					break;
				}
				case KeyEvent.VK_RIGHT: //按右键
				{
					snake.move(1,0);
					break;
				}
				default:
					break;
			}
		}
		this.repaint();
	}
	//接口KeyListener需实现方法
	public void keyTyped(KeyEvent e)
	{
		
	}
	//接口KeyListener需实现方法
	public void keyReleased(KeyEvent e)
	{
		
	}
}

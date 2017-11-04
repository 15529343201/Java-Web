package cn.com.mysnake;

import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.JOptionPane;

/**
 * 
 * @author ccq
 * 控制蛇的自动行走
 *
 */
public class SnakeMoveThread extends Thread
{
	SnakeJPanel snakeJPanel;
	private int speed; //速度
	
	public SnakeMoveThread(SnakeJPanel snakeJPanel,int speed)
	{
		super();
		this.snakeJPanel = snakeJPanel;
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void run()
	{
		Snake snake = SnakeJPanel.getSnake();
		while(true)
		{
			snakeMove(snake);
			
			if(SnakeJPanel.isMorePerson)//如果是多人游戏
			{
				LinkedList<Snake> list = SnakeJPanel.getList();
				for(int i = 0 ; i < list.size() ; i++)
				{
					snakeMove(list.get(i));
				}
			}
			
			//调用刷新界面
			this.snakeJPanel.repaint();
			
			//判断多人游戏结束
			if(SnakeJPanel.isMorePerson)
			{
				if(isAllDead())
				{
					System.out.println("多人游戏结束");
					SnakeJPanel.isGameStart = false;
					SnakeJPanel.isMorePerson = false;
					//关闭服务器socket
					if(SnakeJPanel.getSnake().getIsServerSnake())
					{
						snakeJPanel.getServer().stopServer();
						snakeJPanel.getServer().setState(false);
					}
					else
						snakeJPanel.getClient().stopClient();
					JOptionPane.showMessageDialog(null,"Game over","游戏结束",JOptionPane.ERROR_MESSAGE);//提示框
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					SnakeJPanel.getList().clear();
					UdpThread.clearList();
				}
			}
			
			try {
				Thread.sleep(this.speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private boolean isAllDead()
	{
		boolean flag = false;
		for(Snake temp : SnakeJPanel.getList())
		{
			if(temp.getState())
				flag = true;
		}
		if(SnakeJPanel.getSnake().getState())
			flag = true;
		
		if(flag)
			return false;
		else
			return true;
	}
	
	
	private void snakeMove(Snake snake)
	{
		if(snake.getState())
		{
			int direction = snake.getDirection();
			switch (direction)
			{
				case KeyEvent.VK_UP: //按上键
				{
					snake.move(0,-1); //可以改为调用snakeJPanel的keyPressed方法
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
	}
}

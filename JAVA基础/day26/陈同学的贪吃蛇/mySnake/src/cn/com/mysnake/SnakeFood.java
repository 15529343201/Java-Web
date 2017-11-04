package cn.com.mysnake;

import java.awt.Color;
import java.util.Random;
/**
 * 
 * @author ccq
 * 食物
 *
 */
public class SnakeFood
{
	private int x;
	private int y;
	public static final int FOODSIZE = SnakeBody.SIZE;
	public Color foodColor;
	Random random;
	
	public SnakeFood()
	{
		foodColor = new Color(0,255,0);
		random = new Random();
	}
	
	public void crateFood()
	{
		//通过随机数生成食物的X Y位置
		this.x = random.nextInt(SnakeJPanel.SIZE_X/this.FOODSIZE);
		this.y = random.nextInt(SnakeJPanel.SIZE_Y/this.FOODSIZE);
	}
	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y; //这里直接返回实际Y的坐标
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
}

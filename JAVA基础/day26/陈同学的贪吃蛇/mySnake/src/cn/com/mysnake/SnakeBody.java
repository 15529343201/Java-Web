package cn.com.mysnake;
/**
 * 
 * @author ccq
 * ÉßµÄÉíÌå
 *
 */
public class SnakeBody 
{
	private int x;
	private int y;
	public static final int SIZE = 20;
	
	public SnakeBody(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public boolean equals(Object obj) 
	{
		if(((SnakeBody)obj).x == this.x && ((SnakeBody)obj).y == this.y)
			return true;
		else
			return false;
	}
}

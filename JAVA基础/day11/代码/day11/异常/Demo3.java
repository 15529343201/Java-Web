/*
需求：模拟你去吃木桶饭，如果带钱少于了10块，那么就抛出一个没有带够钱的异常对象，
如果带够了，那么就可以吃上香喷喷的地沟油木桶饭.

*/

//定义没钱的异常
class NoMoneyException extends Exception {

	public NoMoneyException(String message){
		super(message);
	}

}



class Demo3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
			eat(9);

		}catch(NoMoneyException e){
			e.printStackTrace();
			System.out.println("跟我洗碗一个月！！");
		}
	}


	public static void eat(int money) throws NoMoneyException{
		if(money<10){
			throw new NoMoneyException("吃霸王餐");
		}
		System.out.println("吃上了香喷喷的地沟油木桶饭!!");
	}
}

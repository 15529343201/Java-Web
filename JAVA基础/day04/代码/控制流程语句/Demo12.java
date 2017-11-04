/*
需求： 在控制台上打印一个 五行五列矩形/.
	
	*****
	*****
	*****
	*****
	*****
	
先打印一行




*/
class Demo12 {

	public static void main(String[] args) 
	{
		for(int j = 0 ; j<5 ; j++){ //  控制行数
			for(int i = 0 ; i<5 ; i++){ // 控制列数
				System.out.print("*");
			}  // *****
				//换行
			System.out.println();
			
		}
		

	}
}

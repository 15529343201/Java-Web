class User{

	String userName;


	String password;


}


class Demo13 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		User[] users = new User[10];
		while(true){
			System.out.println("请选择功能 : A(注册)   B(查看用户)");
			String option = scanner.next();
			if(option.equals("A")){
				System.out.println("请输入用户名:");
				String userName = scanner.next();
				System.out.println("请输入密码:");
				String password = scanner.next();
				


			}else if(option.equals("B")){
				
			}
		}
	}
}

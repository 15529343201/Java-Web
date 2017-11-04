package cn.itcast.main;

import java.util.Scanner;

import cn.itcast.dao.UserDao;

public class LibararyMain {
	
	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*    1208java基础班图书馆                                           *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		UserDao userDao = new UserDao();

		while(true){
			System.out.println("请选择功能：A(用户登陆)    B(注册用户)      Q(退出系统)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				
				
			}else if("b".equalsIgnoreCase(option)){
				//注册
				userDao.reg();
				
			}else if("Q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
		
		
	}

}

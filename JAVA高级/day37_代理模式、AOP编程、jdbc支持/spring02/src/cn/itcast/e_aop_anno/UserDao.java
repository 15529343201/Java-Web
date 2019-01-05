package cn.itcast.e_aop_anno;

import org.springframework.stereotype.Component;

/**
 * 目标对象
 */
@Component   // 加入容器
public class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("-----核心业务：保存！！！------"); 
	}
}

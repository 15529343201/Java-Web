package cn.itcast.g_pointcut;


/**
 * Ŀ�����
 *
 */
public class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("-----����ҵ�񣺱��棡����------"); 
	}
}

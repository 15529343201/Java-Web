package cn.itcast.f_aop_xml;


/**
 * Ŀ�����
 */
public class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("-----����ҵ�񣺱��棡����------"); 
	}
}

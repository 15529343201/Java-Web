package cn.itcast.service;

import cn.itcast.entity.Admin;

/**
 * ����Աҵ���߼���ӿ�
 */
public interface IAdminService {

	/**
	 * ע��
	 * @param admin
	 */
	void register(Admin admin);

	/**
	 * ��½
	 * @param admin
	 * @return
	 */
	Admin login(Admin admin);

}

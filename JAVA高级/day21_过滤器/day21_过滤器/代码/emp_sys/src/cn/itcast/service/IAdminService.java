package cn.itcast.service;

import cn.itcast.entity.Admin;

/**
 * 3. 管理员业务逻辑层
 * @author Jie.Yuan
 *
 */
public interface IAdminService {

	/**
	 * 根据用户名密码查询
	 * @param admin
	 * @return
	 */
	Admin findByNameAndPwd(Admin admin);
}

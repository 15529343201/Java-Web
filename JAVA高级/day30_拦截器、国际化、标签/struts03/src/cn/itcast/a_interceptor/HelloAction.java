package cn.itcast.a_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action��������
 *
 */
public class HelloAction extends ActionSupport{

	public HelloAction() {
		System.out.println("1. Actionʵ��������");
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("3. ִ����������ķ���: execute");
		return super.execute();
	}
}

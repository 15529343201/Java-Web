package cn.itcast.a_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * �Զ���������
 *
 */
public class HelloInterceptor implements Interceptor{
	
	// ����ʱ��ִ��
	public HelloInterceptor(){
		System.out.println("����������������");
	}

	// ����ʱ��ִ��
	public void init() {
		System.out.println("ִ�����������ĳ�ʼ������");
	}

	// ������ҵ������ ���ڷ���actionʱ��ִ�У� ��execute֮ǰִ�У���
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("2. ִ��Action֮ǰ");
		
		// ������һ����������ִ��Action  (�൱��chain.doFilter(..)
		// ��ȡ���ǣ� execute�����ķ���ֵ
		String resultFlag = invocation.invoke();
		
		System.out.println("4. ��������ҵ����-����" + resultFlag);
		
		return resultFlag;
	}
	

	public void destroy() {
		System.out.println("����....");
	}


}

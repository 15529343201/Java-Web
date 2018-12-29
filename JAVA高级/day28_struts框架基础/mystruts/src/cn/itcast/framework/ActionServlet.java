package cn.itcast.framework;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.framework.bean.ActionMapping;
import cn.itcast.framework.bean.ActionMappingManager;
import cn.itcast.framework.bean.Result;
/*
 * ���Ŀ�����,����Ŀֻ��һ��servlet
 * 1.�������е�*.actionΪ��׺������
 * 2.����:http://localhost:8080/mystruts/login.action
 * 		 http://localhost:8080/mystruts/register.action
 */

public class ActionServlet extends HttpServlet{
	private ActionMappingManager actionMappingManager;
	
	//ִֻ��һ��(ϣ������ʱִ��)
	@Override
	public void init() throws ServletException {
		System.out.println("ActionServlet.init()");
		actionMappingManager=new ActionMappingManager();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			//1.��ȡ����uri,�õ�����·������[login]
			String uri=req.getRequestURI();
			//�õ�login
			String actionName=uri.substring(uri.lastIndexOf("/")+1,uri.indexOf(".action"));
			//2.����·������,��ȡ�����ļ�,�õ����ȫ��[cn.itcast.framework.action.LoginAction]
			ActionMapping actionMapping=actionMappingManager.getActionMapping(actionName);
			String className=actionMapping.getClassName();
			//��ǰ����Ĵ�����[method="login"]
			String method=actionMapping.getMethod();
			//3.����:��������,���÷���:��ȡ�������صı��
			Class<?> clazz=Class.forName(className);
			Object obj=clazz.newInstance();//LoginAction loginAction = new LoginAction();
			Method m=clazz.getDeclaredMethod(method, HttpServletRequest.class,HttpServletResponse.class);
			//���÷������صı��
			String returnFlag=(String)m.invoke(obj, req,resp);
			//4.�õ����,��ȡ�����ļ��õ���Ƕ�Ӧ��ҳ��,��ת����
			Result result=actionMapping.getResults().get(returnFlag);
			//����
			String type=result.getType();
			//ҳ��
			String page=result.getPage();
			//��ת
			if("redirect".equals(type)){
				resp.sendRedirect(req.getContextPath()+page);
			}else{
				req.getRequestDispatcher(page).forward(req, resp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}


package cn.itcast.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itcast.entity.Admin;
import cn.itcast.exception.UserExistsException;
import cn.itcast.service.IAdminService;
import cn.itcast.service.impl.AdminService;
import cn.itcast.utils.WebUtils;

/**
 * 4. ���Ʋ㿪��
 * 
 * @author Jie.Yuan
 * 
 */
public class AdminServlet extends HttpServlet {
	
	// ���õ�service
	private IAdminService adminService = new AdminService();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// ����
		request.setCharacterEncoding("UTF-8");

		// ��ȡ��������
		String method = request.getParameter("method");
		if ("register".equals(method)) {
			register(request,response);
		}
	}

	/**
	 * ע�ᴦ����
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void register(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		
//		//1. ��ȡ�������
//		String userName = request.getParameter("userName");
//		String pwd = request.getParameter("pwd");
//		// ��װ
//		Admin admin = new Admin();
//		admin.setUserName(userName);
//		admin.setPwd(pwd);
		
		// ʹ��BeanUtils��������������ݵķ�װ
		Admin admin = WebUtils.copyToBean(request, Admin.class);
		
		
		//2. ����Service����ע���ҵ���߼�
		try {
			adminService.register(admin);
			
			// ע��ɹ�����ת����ҳ
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		} catch (UserExistsException e) {
			// �û������ڣ�ע��ʧ��(��ת��ע��ҳ��)
			request.setAttribute("message", "�û����Ѿ�����");
			// ת��
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();  // ����ʱ����
			// ��������, ��ת������ҳ��
			response.sendRedirect(request.getContextPath() + "/error/error.jsp");
		}
	}

}

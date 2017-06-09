package cn.itcast.javaee.js.time;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ع˴�ͳWebӦ���������Ӧ�ص㡾��ʾ��ǰʱ�䡿 
 * @author AdminTC
 */
public class TimeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//����
		System.out.println("GET");
		//����SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����ǰ���ڰ���ָ����ʽ������ַ���
		String nowStr = sdf.format(new Date());
		//������󶨵�request�������
		request.setAttribute("nowStr",nowStr);
		//ת����06_time.jspҳ��
		request.getRequestDispatcher("/06_time.jsp").forward(request,response);
	}
}








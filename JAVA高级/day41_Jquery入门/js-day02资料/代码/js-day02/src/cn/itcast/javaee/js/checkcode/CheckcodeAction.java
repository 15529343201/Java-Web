package cn.itcast.javaee.js.checkcode;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ��֤����
 * @author AdminTC
 */
public class CheckcodeAction extends ActionSupport{
	//�ͻ�����֤��
	private String checkcode;//2525
	//ע��ͻ�����֤��
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	/**
	 * ��֤
	 */	
	public String check() throws Exception {
		//ͼƬ·��
		String tip = "images/MsgError.gif";
		//�ӷ�������ȡsession�е���֤��
		String checkcodeServer = (String) ActionContext.getContext().getSession().get("CHECKNUM");
		//���ͻ��˵���֤�������˵���֤����бȽ�
		if(checkcode.equals(checkcodeServer)){
			tip = "images/MsgSent.gif";
		}
		//��IO���ķ�ʽ��tip������ֵ�����AJAX�첽������
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
		//���·�ʽ������õģ����������AJAX�첽����
		return null;
	}
}










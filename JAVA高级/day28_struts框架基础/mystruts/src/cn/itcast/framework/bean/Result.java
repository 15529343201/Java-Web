package cn.itcast.framework.bean;
/*
 * ��װ�����ͼ
 * <result name="success" type="redirect">/index.jsp</result>
 */
public class Result {
	//��ת�Ľ�����
	private String name;
	//��ת���͡�Ĭ��Ϊת��:"redirect"Ϊ�ض���
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//��ת��ҳ��
	private String page;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	

}

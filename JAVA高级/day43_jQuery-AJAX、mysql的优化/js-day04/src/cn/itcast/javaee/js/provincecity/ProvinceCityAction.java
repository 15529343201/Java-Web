package cn.itcast.javaee.js.provincecity;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������ 
 * @author AdminTC
 */
public class ProvinceCityAction extends ActionSupport{
	private String province;
	public void setProvince(String province) {
		this.province = province;
		//System.out.println("ע��" + province);
	}
	//����ʡ�ݲ�ѯ����
	public String findCityByProvince() throws Exception {
		setCity = new LinkedHashSet<String>();
		if("����".equals(province)){
			setCity.add("��ɳ");
			setCity.add("����");
		}else if("�㶫".equals(province)){
			setCity.add("����");
			setCity.add("��ɽ");
			setCity.add("��ɽ");
		}
		return SUCCESS;
	}
	private Set<String> setCity;
	public Set<String> getSetCity() {
		return setCity;
	}
}






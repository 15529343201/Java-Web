package cn.itcast.javaee.js.provincecityarea;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ʡ��-����-��������������Struts2 + JSON�桿
 * @author AdminTC
 */
public class ProvinceCityAreaAction extends ActionSupport{
	private Bean bean;
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
	/**
	 * ����ʡ�ݻ�ȡ���� 
	 */
	public String findCityByProvince() throws Exception {
		cityList = new ArrayList<String>();
		if("����".equals(bean.getProvince())){
			cityList.add("�人");
			cityList.add("���");
		}else if("����".equals(bean.getProvince())){
			cityList.add("����");
			cityList.add("�żҽ�");
			cityList.add("���");
		}else if("�㶫".equals(bean.getProvince())){
			cityList.add("����");
			cityList.add("��Զ");
			cityList.add("��ɽ");
			cityList.add("տ��");
		}
		//��struts2��ܰ��㽫List/Set/Map<String>ת��JSON�ı�
		return SUCCESS;
	}
	
	
	/**
	 * ���ݳ��л�ȡ���� 
	 */
	public String findAreaByCity() throws Exception {
		areaList = new ArrayList<String>();
		if("����".equals(bean.getCity())){
			areaList.add("AA");
			areaList.add("BB");
		}else if("��Զ".equals(bean.getCity())){
			areaList.add("CC");
			areaList.add("DD");;
		}else if("��ɽ".equals(bean.getCity())){
			areaList.add("EE");
			areaList.add("FF");
		}else if("տ��".equals(bean.getCity())){
			areaList.add("GG");
			areaList.add("HH");
		}
		return SUCCESS;
	}
	private List<String> areaList;//����ļ���
	private List<String> cityList;//���еļ���
	public List<String> getCityList() {
		return cityList;
	}
	public List<String> getAreaList() {
		return areaList;
	}
	
	
	
}







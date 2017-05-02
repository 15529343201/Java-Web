package cn.itcast.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import cn.itcast.entity.Admin;

public class WebUtils {

	
	@Deprecated
	public static <T> T copyToBean_old(HttpServletRequest request, Class<T> clazz) {
		try {
			// ��������
			T t = clazz.newInstance();
			
			// ��ȡ���еı�Ԫ�ص�����
			Enumeration<String> enums = request.getParameterNames();
			// ����
			while (enums.hasMoreElements()) {
				// ��ȡ��Ԫ�ص�����:<input type="password" name="pwd"/>
				String name = enums.nextElement();  // pwd
				// ��ȡ���ƶ�Ӧ��ֵ
				String value = request.getParameter(name);
				// ��ָ���������ƶ�Ӧ��ֵ���п���
				BeanUtils.copyProperty(t, name, value);
			}
			
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * �����������ݵķ�װ
	 */
	public static <T> T copyToBean(HttpServletRequest request, Class<T> clazz) {
		try {
			// ��ע����������ת������
			// ��������
			T t = clazz.newInstance();
			BeanUtils.populate(t, request.getParameterMap());
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

package cn.itcast.stringbuffer;
/*
�����ҪƵ���޸��ַ��� �����ݣ�����ʹ���ַ������� �ࣨStringBuffer����


StringBuffer ��ʵ����һ���洢�ַ� ��������

������Ŀ��ʹ��Stringbuffer�� �εĹ��캯������ һ������ʱ��Ĭ�ϵĳ�ʼ�����Ƕ��٣� ������Ȳ���ʹ���ˣ��Զ��������ٱ���
	StringBuffer �ײ���������һ���ַ�������ܴ洢�ַ����� �ģ����ַ�������Ĭ�� �ĳ�ʼ������16�� ����ַ�����ĳ��Ȳ���ʹ�� �����Զ�����1����


�����ľ߱� ����Ϊ
	
	����
	
	
	
	ɾ��
	
	
	
	�޸�
	
	
	
	�鿴
	
	
	
	
	�ж� 




*/

public class Demo2 {
	
	public static void main(String[] args) {
		//��ʹ��StringBuffer�޲εĹ��캯������һ���ַ��������ࡣ
		StringBuffer sb = new StringBuffer(); 
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		
		System.out.println(sb);
		
		
	}
	
}

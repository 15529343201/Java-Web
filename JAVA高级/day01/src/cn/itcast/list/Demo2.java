package cn.itcast.list;


//import java.security.KeyStore.Entry;
//import java.util.Map.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;





public class Demo2 {
	public static void main(String[] args) {
		//ʹ��get��������.
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		
		System.out.println("======get��ʽ����========");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//ʹ�õ����� �������ڵ����Ĺ����в���ʹ�ü��϶����޸ļ����е�Ԫ�ظ���
		//�����Ҫ�޸�Ҫʹ�õ������ķ��������޸�
		System.out.println("\r\n======��������ʽ����=======");
		HashSet<String> set=new HashSet<String>();
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		
		//��ȡ��������
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+",");
		}
		
		for(String item:set){
			System.out.println(item+",");
		}
		
		System.out.println("\r\n======��������ʽ����======");
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("����", "001");
		map.put("����", "002");
		map.put("����", "003");
		Set<java.util.Map.Entry<String, String>> entrys=map.entrySet();
		for (java.util.Map.Entry<String, String> entry : entrys) {
			System.out.println("����"+entry.getKey()+" ֵ��"+entry.getValue());
		}
	}

}

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
		//使用get方法遍历.
		ArrayList<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		System.out.println("======get方式遍历========");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//使用迭代器 迭代器在迭代的过程中不能使用集合对象修改集合中的元素个数
		//如果需要修改要使用迭代器的方法进行修改
		System.out.println("\r\n======迭代器方式便利=======");
		HashSet<String> set=new HashSet<String>();
		set.add("狗娃");
		set.add("狗剩");
		set.add("铁蛋");
		
		//获取到迭代器
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+",");
		}
		
		for(String item:set){
			System.out.println(item+",");
		}
		
		System.out.println("\r\n======迭代器方式遍历======");
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("张三", "001");
		map.put("李四", "002");
		map.put("王五", "003");
		Set<java.util.Map.Entry<String, String>> entrys=map.entrySet();
		for (java.util.Map.Entry<String, String> entry : entrys) {
			System.out.println("键："+entry.getKey()+" 值："+entry.getValue());
		}
	}

}

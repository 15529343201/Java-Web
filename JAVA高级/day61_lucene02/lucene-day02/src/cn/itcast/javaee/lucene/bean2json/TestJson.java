package cn.itcast.javaee.lucene.bean2json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.junit.Test;

/**
 * 演示用第三方工具类，将JavaBean、List、Map<String,Object>转成JSON文本
 * @author AdminTC
 */
public class TestJson {
	@Test
	public void javabean2json(){
		User user = new User(1,"哈哈",7000,"男");
		JSONArray jsonArray = JSONArray.fromObject(user);
		String jsonJAVA = jsonArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"sex":"男","name":"哈哈","sal":7000}]
	}
	@Test
	public void list2json(){
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"班长",7000,"男"));
		userList.add(new User(2,"班长老婆",8000,"男"));
		userList.add(new User(3,"班长小孩",20000,"男"));
		JSONArray jsonArray = JSONArray.fromObject(userList);
		String jsonJAVA = jsonArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"sex":"男","name":"班长","sal":7000},{"id":2,"sex":"男","name":"班长老婆","sal":8000},{"id":3,"sex":"男","name":"班长小孩","sal":20000}]
	}	
	@Test
	public void map2json(){
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"班长",7000,"男"));
		userList.add(new User(2,"班长老婆",8000,"女"));
		userList.add(new User(3,"班长小孩",20000,"男"));
		userList.add(new User(4,"班长小孩的小孩",40000,"男"));

		Map<String,Object> map = new HashMap<String,Object>();
		//total表示集合的长度
		map.put("total",userList.size());
		//rows表示集合内容
		map.put("rows",userList);
		
		JSONArray jsonArray = JSONArray.fromObject(map);
		String jsonJAVA = jsonArray.toString();
		System.out.println(jsonJAVA);
		
		jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
		
		System.out.println(jsonJAVA);
		/*
		[
			{
				"total":4,
				"rows":
					[
						{
							"id":1,
							"sex":"男",
							"name":"班长",
							"sal":7000
						},
						{
							"id":2,
							"sex":"女",
							"name":"班长老婆",
							"sal":8000
						},
						{
							"id":3,
							"sex":"男",
							"name":"班长小孩",
							"sal":20000
						},
						{
							"id":4,
							"sex":"男",
							"name":"班长小孩的小孩",
							"sal":40000
						}
					]
			}
	]
		{"total":4,"rows":[{"id":1,"sex":"男","name":"班长","sal":7000},{"id":2,"sex":"女","name":"班长老婆","sal":8000},{"id":3,"sex":"男","name":"班长小孩","sal":20000},{"id":4,"sex":"男","name":"班长小孩的小孩","sal":40000}]}
		 */
	}
}













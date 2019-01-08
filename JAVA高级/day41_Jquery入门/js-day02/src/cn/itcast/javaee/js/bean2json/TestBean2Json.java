package cn.itcast.javaee.js.bean2json;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;

/**
 * 使用第三方工具，将JavaBean对象/List或Set或Map对象转成JSON 
 * @author AdminTC
 */
public class TestBean2Json {
	private static void javabean2json() {
		City city = new City(1,"广州");
		JSONArray jSONArray = JSONArray.fromObject(city);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"广州"}]
	}
	private static void list2json() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"广州"));
		cityList.add(new City(2,"珠海"));
		JSONArray jSONArray = JSONArray.fromObject(cityList);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"广州"},{"id":2,"name":"珠海"}]
	}
	private static void set2json() {
		Set<City> citySet = new LinkedHashSet<City>();
		citySet.add(new City(1,"广州"));
		citySet.add(new City(2,"珠海"));
		JSONArray jSONArray = JSONArray.fromObject(citySet);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"广州"},{"id":2,"name":"珠海"}]
	}
	private static void javabeanlist2json() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"中山"));
		cityList.add(new City(2,"佛山"));
		Province province = new Province(1,"广东",cityList);
		
		JSONArray jSONArray = JSONArray.fromObject(province);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		/*
		  [
			 {
			  "id":1,
			  "name":"广东"
			  "cityList":[{"id":1,"name":"中山"},{"id":2,"name":"佛山"}],
		     }
		  ]
		  */
	}
	private static void map2json() {
		
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"中山"));
		cityList.add(new City(2,"佛山"));
		
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		map.put("total",cityList.size());//表示集合的长度
		map.put("rows",cityList);//rows表示集合
		
		JSONArray jSONArray = JSONArray.fromObject(map);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"total":2,"rows":[{"id":1,"name":"中山"},{"id":2,"name":"佛山"}]}]
		
		jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
		System.out.println(jsonJAVA);
		//{"total":2,"rows":[{"id":1,"name":"中山"},{"id":2,"name":"佛山"}]}
	}
	
	public static void main(String[] args) {
		//javabean2json();
		//list2json();
		//set2json();
		//javabeanlist2json();
		map2json();
	}
}

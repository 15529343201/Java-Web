package cn.itcast.javaee.js.bean2json;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;

/**
 * ʹ�õ��������ߣ���JavaBean����/List��Set��Map����ת��JSON 
 * @author AdminTC
 */
public class TestBean2Json {
	private static void javabean2json() {
		City city = new City(1,"����");
		JSONArray jSONArray = JSONArray.fromObject(city);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"����"}]
	}
	private static void list2json() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"����"));
		cityList.add(new City(2,"�麣"));
		JSONArray jSONArray = JSONArray.fromObject(cityList);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"����"},{"id":2,"name":"�麣"}]
	}
	private static void set2json() {
		Set<City> citySet = new LinkedHashSet<City>();
		citySet.add(new City(1,"����"));
		citySet.add(new City(2,"�麣"));
		JSONArray jSONArray = JSONArray.fromObject(citySet);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"id":1,"name":"����"},{"id":2,"name":"�麣"}]
	}
	private static void javabeanlist2json() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"��ɽ"));
		cityList.add(new City(2,"��ɽ"));
		Province province = new Province(1,"�㶫",cityList);
		
		JSONArray jSONArray = JSONArray.fromObject(province);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		/*
		  [
			 {
			  "id":1,
			  "name":"�㶫"
			  "cityList":[{"id":1,"name":"��ɽ"},{"id":2,"name":"��ɽ"}],
		     }
		  ]
		  */
	}
	private static void map2json() {
		
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(1,"��ɽ"));
		cityList.add(new City(2,"��ɽ"));
		
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		map.put("total",cityList.size());//��ʾ���ϵĳ���
		map.put("rows",cityList);//rows��ʾ����
		
		JSONArray jSONArray = JSONArray.fromObject(map);
		String jsonJAVA = jSONArray.toString();
		System.out.println(jsonJAVA);
		//[{"total":2,"rows":[{"id":1,"name":"��ɽ"},{"id":2,"name":"��ɽ"}]}]
		
		jsonJAVA = jsonJAVA.substring(1,jsonJAVA.length()-1);
		System.out.println(jsonJAVA);
		//{"total":2,"rows":[{"id":1,"name":"��ɽ"},{"id":2,"name":"��ɽ"}]}
	}
	
	public static void main(String[] args) {
		//javabean2json();
		//list2json();
		//set2json();
		//javabeanlist2json();
		map2json();
	}
}

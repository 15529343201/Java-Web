package cn.itcast.observer;

import java.util.Random;

public class WeatherMain {

	public static void main(String[] args) throws Exception {
		//工人
		Emp e = new Emp("小明");
		Emp e2 = new Emp("如花");
		
		//学生
		Student s1 = new Student("狗娃");
		Student s2 = new Student("狗剩");
		
		
		WeatherStation station = new WeatherStation();
		station.addListener(e);
		station.addListener(e2);
		station.addListener(s1);
		station.addListener(s2);
		
		
		
		station.startWork();
		
		
	}
	
}

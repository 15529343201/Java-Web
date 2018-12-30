package cn.itcast.d_type;

import java.util.Date;

public class User {

	// 封装请求数据
	private String name;  // 必须给set / get可以不用给
	private String pwd;
	private int age;
	private Date birth;
	public void setName(String name) {
		this.name = name;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}
	public Date getBirth() {
		return birth;
	}
	
}

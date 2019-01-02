package cn.itcast.entity;

import java.util.Date;

public class Employee {

	private int id;// INT PRIMARY KEY AUTO_INCREMENT,
	private String empName;// VARCHAR(20),
	private Date workDate;// DATE -- 入职时间
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	
}

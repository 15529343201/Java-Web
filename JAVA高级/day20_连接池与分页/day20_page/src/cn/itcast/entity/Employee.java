package cn.itcast.entity;

/**
 * 1. 实体类设计 (因为用了DbUtils组件，属性要与数据库中字段一致)
 * @author Jie.Yuan
 *
 */
public class Employee {

	private int empId;			// 员工id
	private String empName;		// 员工名称
	private int dept_id;		// 部门id
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int deptId) {
		dept_id = deptId;
	}
	
	
}

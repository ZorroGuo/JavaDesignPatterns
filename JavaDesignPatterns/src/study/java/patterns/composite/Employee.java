package study.java.patterns.composite;

import java.util.List;

/**
 * Employee.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public abstract class Employee {
	private String name;// 雇员姓名
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public List<Employee> employees;// 雇员列表
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	
	/**
	 * 添加雇员
	 * @param employee
	 */
	public abstract void addEmployee(Employee employee);
	
	/**
	 * 删除雇员
	 * @param employee
	 */
	public abstract void deleteEmployee(Employee employee);
	
}

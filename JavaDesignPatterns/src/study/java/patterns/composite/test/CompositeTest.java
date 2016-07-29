package study.java.patterns.composite.test;

import java.util.List;

import org.junit.Test;

import study.java.patterns.composite.AndroidProgramer;
import study.java.patterns.composite.Employee;
import study.java.patterns.composite.JavaProgramer;
import study.java.patterns.composite.ProjectManager;

/**
 * CompositeTest.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class CompositeTest {

	@Test
	public void test() {
		Employee javaProgrammer1 = new JavaProgramer("java程序员1");
		Employee javaProgrammer2 = new JavaProgramer("java程序员2");
		Employee androidProgrammer1 = new AndroidProgramer("android程序员1");
		Employee androidProgrammer2 = new AndroidProgramer("android程序员2");
		Employee projectManager = new ProjectManager("项目经理");
		
		projectManager.addEmployee(javaProgrammer1);
		projectManager.addEmployee(javaProgrammer2);
		projectManager.addEmployee(androidProgrammer1);
		projectManager.addEmployee(androidProgrammer2);

		List<Employee> employees = projectManager.getEmployees();
		System.out.println("添加后的组员信息：");
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}
		
		projectManager.deleteEmployee(javaProgrammer2);
		projectManager.deleteEmployee(androidProgrammer1);
		System.out.println("删除后的组员信息：");
		employees = projectManager.getEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

}

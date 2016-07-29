package study.java.patterns.composite;

import java.util.ArrayList;

/**
 * ProjectManager.java
 * <p>
 * Created on 2016年7月26日项目经理
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ProjectManager extends Employee {
	
	public ProjectManager(String name) {
		setName(name);
		employees = new ArrayList();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.composite.Employee#addEmployee(cn.maomao.study.patterns.composite.Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.composite.Employee#deleteEmployee(cn.maomao.study.patterns.composite.Employee)
	 */
	@Override
	public void deleteEmployee(Employee employee) {
		employees.remove(employee);
	}

}

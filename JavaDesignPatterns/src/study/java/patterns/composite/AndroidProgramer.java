package study.java.patterns.composite;

/**
 * AndroidProgramer.java
 * <p>
 * Created on 2016年7月26日Android程序员
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class AndroidProgramer extends Employee {
	
	public AndroidProgramer(String name) {
		setName(name);
		employees = null;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.composite.Employee#addEmployee(cn.maomao.study.patterns.composite.Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {

	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.composite.Employee#deleteEmployee(cn.maomao.study.patterns.composite.Employee)
	 */
	@Override
	public void deleteEmployee(Employee employee) {

	}

}

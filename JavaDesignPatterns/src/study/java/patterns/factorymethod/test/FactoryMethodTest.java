package study.java.patterns.factorymethod.test;

import org.junit.Test;

import study.java.patterns.factorymethod.IWorkFactory;
import study.java.patterns.factorymethod.impl.EmployeeWorkFactory;
import study.java.patterns.factorymethod.impl.EmployerWorkFactory;

/**
 * FactoryMethodTest.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class FactoryMethodTest {

	@Test
	public void test() {
		IWorkFactory employerWorkFactory = new EmployerWorkFactory();
		employerWorkFactory.getWork().doWork();
		
		IWorkFactory employeeWorkFactory = new EmployeeWorkFactory();
		employeeWorkFactory.getWork().doWork();
	}

}

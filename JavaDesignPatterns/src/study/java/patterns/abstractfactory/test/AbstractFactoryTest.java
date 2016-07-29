package study.java.patterns.abstractfactory.test;

import org.junit.Test;

import study.java.patterns.abstractfactory.IEngineer;
import study.java.patterns.abstractfactory.IHRFactory;
import study.java.patterns.abstractfactory.IManager;
import study.java.patterns.abstractfactory.impl.ClientHRFactory;
import study.java.patterns.abstractfactory.impl.ServerHRFactory;

/**
 * AbstractFactoryTest.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class AbstractFactoryTest {

	@Test
	public void test() {
		IHRFactory clientHrFactory = new ClientHRFactory();
		
		IManager clientManager = clientHrFactory.employManager();
		clientManager.calSalary();
		
		IEngineer clientEngineer = clientHrFactory.employeEngineer();
		clientEngineer.calSalary();
		
		IHRFactory serverHrFactory = new ServerHRFactory();
		IManager serverManager = serverHrFactory.employManager();
		serverManager.calSalary();
		
		IEngineer serverEngineer = serverHrFactory.employeEngineer();
		serverEngineer.calSalary();
	}

}

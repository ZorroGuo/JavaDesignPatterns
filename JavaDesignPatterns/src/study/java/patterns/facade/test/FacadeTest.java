package study.java.patterns.facade.test;

import org.junit.Test;

import study.java.patterns.facade.Fecade;
import study.java.patterns.facade.ServiceA;
import study.java.patterns.facade.ServiceB;
import study.java.patterns.facade.ServiceC;
import study.java.patterns.facade.impl.ServiceAImpl;
import study.java.patterns.facade.impl.ServiceBImpl;
import study.java.patterns.facade.impl.ServiceCImpl;

/**
 * FacadeTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class FacadeTest {

	@Test
	public void test() {
		ServiceA sa = new ServiceAImpl();
		sa.methodA();
		ServiceB sb = new ServiceBImpl();
		sb.methodB();
		ServiceC sc = new ServiceCImpl();
		sc.methodC();
		
		Fecade fecade = new Fecade();
		fecade.methodA();
		fecade.methodB();
		fecade.methodC();
	}

}

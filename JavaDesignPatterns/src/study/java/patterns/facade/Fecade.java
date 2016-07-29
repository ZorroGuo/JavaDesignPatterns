package study.java.patterns.facade;

import study.java.patterns.facade.impl.ServiceAImpl;
import study.java.patterns.facade.impl.ServiceBImpl;
import study.java.patterns.facade.impl.ServiceCImpl;

/**
 * Fecade.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Fecade {
	public ServiceA serviceA;
	public ServiceB serviceB;
	public ServiceC serviceC;
	
	public Fecade() {
		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}
	
	public void methodA() {
		System.out.println("Fecade->methodA: ");
		serviceA.methodA();
		serviceB.methodB();
	}
	
	public void methodB() {
		System.out.println("Fecade->methodB: ");
		serviceB.methodB();
		serviceC.methodC();
	}
	
	public void methodC() {
		System.out.println("Fecade->methodC: ");
		serviceC.methodC();
		serviceA.methodA();
	}
}

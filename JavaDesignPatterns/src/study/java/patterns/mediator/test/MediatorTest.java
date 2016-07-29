package study.java.patterns.mediator.test;

import org.junit.Test;

import study.java.patterns.mediator.ConcreteMediator;
import study.java.patterns.mediator.Mediator;

/**
 * MediatorTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class MediatorTest {

	@Test
	public void test() {
		Mediator mediator = new ConcreteMediator();
		mediator.notice("A");
		mediator.notice("B");
		mediator.notice("C");
	}

}

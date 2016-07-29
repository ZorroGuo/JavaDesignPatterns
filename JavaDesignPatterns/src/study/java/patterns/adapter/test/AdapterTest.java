package study.java.patterns.adapter.test;

import org.junit.Test;

import study.java.patterns.adapter.Adaptee;
import study.java.patterns.adapter.Adapter;
import study.java.patterns.adapter.Target;

/**
 * AdapterTest.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class AdapterTest {

	@Test
	public void test() {
		Target target = new Adapter(new Adaptee());
		
		target.adapteeMethod();
		target.adapterMethod();
	}

}

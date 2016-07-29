package study.java.patterns.prototype.test;

import org.junit.Test;

import study.java.patterns.prototype.ConcretePrototype;
import study.java.patterns.prototype.Prototype;

/**
 * PrototypeTest.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class PrototypeTest {

	@Test
	public void test() throws CloneNotSupportedException {
		Prototype protoType1 = new ConcretePrototype("张三", 10);
		Prototype protoType2 = (Prototype) protoType1.clone();
		
		System.out.println(protoType1);
		System.out.println(protoType2);
		System.out.println(protoType1.getAge());
		System.out.println(protoType2.getAge());
	}

}

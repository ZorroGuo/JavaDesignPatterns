package study.java.patterns.prototype;

/**
 * ConcretePrototype.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */

public class ConcretePrototype extends Prototype {

	public ConcretePrototype(String name, int age) {
		setName(name);
		setAge(age);
	}
}

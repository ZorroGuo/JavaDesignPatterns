package study.java.patterns.flyweight.test;

import org.junit.Test;

import study.java.patterns.flyweight.FlyweightFactory;
import study.java.patterns.flyweight.IFlyweight;

/**
 * FlyweightTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class FlyweightTest {

	@Test
	public void test() {
		IFlyweight fw1 = FlyweightFactory.getFlyweight("a"); 
		fw1.method("a");
		
		IFlyweight fw2 = FlyweightFactory.getFlyweight("a"); 
		System.out.println(fw1 == fw2);
		
		IFlyweight fw3 = FlyweightFactory.getFlyweight("b"); 
		fw3.method("b");
		
		IFlyweight fw4 = FlyweightFactory.getFlyweight("c"); 
		fw4.method("c");
		
		System.out.println(FlyweightFactory.getSize());
	}

}

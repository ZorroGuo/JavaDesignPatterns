package study.java.patterns.singleton.test;

import org.junit.Test;

import study.java.patterns.singleton.Singleton;

/**
 * SingletonTest.java
 * <p>
 * Created on 2016年7月26日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class SingletonTest {

	@Test
	public void test() {
		Singleton singleTon1 = new Singleton();
		Singleton singleTon2 = new Singleton();
		
		System.out.println(singleTon1);
		System.out.println(singleTon2);
		
		Singleton singleTon3 = Singleton.getInstance();
		Singleton singleTon4 = Singleton.getInstance();
		
		System.out.println(singleTon3);
		System.out.println(singleTon4);
	}

}

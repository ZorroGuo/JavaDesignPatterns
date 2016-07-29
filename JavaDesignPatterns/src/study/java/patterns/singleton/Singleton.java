package study.java.patterns.singleton;

/**
 * Singleton.java
 * <p>
 * Created on 2016年7月26日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class Singleton {
	private static Singleton singleTon;
	
	public Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleTon == null) {
			singleTon = new Singleton();
		}
		
		return singleTon;
	}
}

package study.java.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class FlyweightFactory {
	
	private static Map flyweights = new HashMap();
	
	public static IFlyweight getFlyweight(String key) {
		if(flyweights.get(key) == null) {
			flyweights.put(key, new FlyweightImpl());
		}
		
		return (IFlyweight) flyweights.get(key);
	}
	
	public static int getSize() {
		return flyweights.size();
	}
}

package study.java.patterns.flyweight;

/**
 * FlyweightImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class FlyweightImpl implements IFlyweight {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.flyweight.IFlyweight#method(java.lang.String)
	 */
	@Override
	public void method(String info) {
		System.out.println("info is: " + info);
	}

}

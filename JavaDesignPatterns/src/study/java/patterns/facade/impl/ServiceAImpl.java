package study.java.patterns.facade.impl;

import study.java.patterns.facade.ServiceA;

/**
 * ServiceAImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ServiceAImpl implements ServiceA {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.facade.ServiceA#methodA()
	 */
	@Override
	public void methodA() {
		System.out.println("ServiceA->methodA");
	}

}

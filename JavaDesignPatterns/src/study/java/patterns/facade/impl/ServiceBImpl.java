package study.java.patterns.facade.impl;

import study.java.patterns.facade.ServiceB;

/**
 * ServiceBImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ServiceBImpl implements ServiceB {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.facade.ServiceB#methodB()
	 */
	@Override
	public void methodB() {
		System.out.println("ServiceB->methodB");
	}

}

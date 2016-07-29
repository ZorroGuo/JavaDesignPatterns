package study.java.patterns.facade.impl;

import study.java.patterns.facade.ServiceC;

/**
 * ServiceCImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ServiceCImpl implements ServiceC {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.facade.ServiceC#methodC()
	 */
	@Override
	public void methodC() {
		System.out.println("ServiceC->methodC");
	}

}

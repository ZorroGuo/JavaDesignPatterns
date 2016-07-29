package study.java.patterns.abstractfactory.impl;

import study.java.patterns.abstractfactory.IManager;

/**
 * TechnicalManager.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class TechnicalManager implements IManager {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.abstractfactory.IManager#calSalary()
	 */
	@Override
	public void calSalary() {
		System.out.println("技术经理的薪酬为：14000*12");
	}

}

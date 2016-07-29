package study.java.patterns.abstractfactory.impl;

import study.java.patterns.abstractfactory.IEngineer;

/**
 * JavaEngineer.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class JavaEngineer implements IEngineer {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.abstractfactory.IEngineer#calSalary()
	 */
	@Override
	public void calSalary() {
		System.out.println("Java工程师的薪酬为：10000*12");
	}

}

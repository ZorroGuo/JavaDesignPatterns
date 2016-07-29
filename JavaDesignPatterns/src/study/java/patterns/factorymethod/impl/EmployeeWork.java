package study.java.patterns.factorymethod.impl;

import study.java.patterns.factorymethod.Work;

/**
 * EmployeeWork.java
 * <p>
 * Created on 2016年7月25日 ConcreteProduct:实现Product接口
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class EmployeeWork implements Work {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.factorymethod.Work#doWork()
	 */
	@Override
	public void doWork() {
		System.out.println("雇员努力工作！");
	}

}

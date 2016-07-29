package study.java.patterns.factorymethod.impl;

import study.java.patterns.factorymethod.IWorkFactory;
import study.java.patterns.factorymethod.Work;

/**
 * EmployeeWorkFactory.java
 * <p>
 * Created on 2016年7月25日 ConcreteCreator:重定义工厂方法以返回一个ConcreteProduct实例
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class EmployeeWorkFactory implements IWorkFactory {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.factorymethod.IWorkFactory#getWork()
	 */
	@Override
	public Work getWork() {
		return new EmployeeWork();
	}

}

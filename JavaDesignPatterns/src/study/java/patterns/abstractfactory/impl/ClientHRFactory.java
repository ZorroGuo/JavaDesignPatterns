package study.java.patterns.abstractfactory.impl;

import study.java.patterns.abstractfactory.IEngineer;
import study.java.patterns.abstractfactory.IHRFactory;
import study.java.patterns.abstractfactory.IManager;

/**
 * ClientHRFactory.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class ClientHRFactory implements IHRFactory {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.abstractfactory.IHRFactory#employManager()
	 */
	@Override
	public IManager employManager() {
		return new TechnicalManager();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.abstractfactory.IHRFactory#employeEngineer()
	 */
	@Override
	public IEngineer employeEngineer() {
		return new AndroidEngineer();
	}

}

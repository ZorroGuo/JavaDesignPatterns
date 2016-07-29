package study.java.patterns.abstractfactory;

/**
 * IHRFactory.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public interface IHRFactory {
	/**
	 * 招聘经理
	 * @return
	 */
	IManager employManager();
	/**
	 * 招聘工程师
	 * @return
	 */
	IEngineer employeEngineer();
}

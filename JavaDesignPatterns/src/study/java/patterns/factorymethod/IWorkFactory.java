package study.java.patterns.factorymethod;

/**
 * IWorkFactory.java
 * <p>
 * Created on 2016年7月25日 Creator:声明工厂方法，该方法返回一个Product类型的对象。
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public interface IWorkFactory {
	/**
	 * 获取工作内容
	 * @return
	 */
	public Work getWork();
}

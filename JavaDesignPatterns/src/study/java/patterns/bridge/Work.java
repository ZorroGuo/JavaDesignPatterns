package study.java.patterns.bridge;

/**
 * Work.java
 * <p>
 * Created on 2016年7月25日  Product:定义工厂方法所创建的对象的接口
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public abstract class Work {
	/**
	 * 工作内容
	 */
	public abstract void doWork(Staff staff);
}

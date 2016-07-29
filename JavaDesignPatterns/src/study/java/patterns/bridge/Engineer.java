package study.java.patterns.bridge;

/**
 * Engineer.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class Engineer extends Staff {
	
	public Engineer() {
		setName("李四");
		setPositon("JAVA工程师");
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.bridge.Staff#currentWork()
	 */
	@Override
	public void currentWork() {
		Work work = getWork();
		work.doWork(this);
	}


}

package study.java.patterns.bridge;

/**
 * Manager.java
 * <p>
 * Created on 2016年7月25日 经理基本信息
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */

public class Manager extends Staff {
	
	public Manager() {
		setName("张三");
		setPositon("技术经理");
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

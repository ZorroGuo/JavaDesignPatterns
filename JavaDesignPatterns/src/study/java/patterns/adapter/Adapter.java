package study.java.patterns.adapter;

/**
 * Adapter.java
 * <p>
 * Created on 2016年7月26日 适配器
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Adapter implements Target {
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.adapter.Target#adapteeMethod()
	 */
	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.adapter.Target#adapterMethod()
	 */
	@Override
	public void adapterMethod() {
		System.out.println("Adapter Method");
		// 使用待适配类的方法
		adaptee.adapteeMethod();
	}

}

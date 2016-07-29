package study.java.patterns.template;

/**
 * Template.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public abstract class Template {
	
	public void prepare() {
		System.out.println("交易预处理");
	}
	
	public abstract void execute();
}

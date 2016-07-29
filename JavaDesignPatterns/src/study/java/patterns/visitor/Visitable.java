package study.java.patterns.visitor;

/**
 * Visitable.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface Visitable {
	
	/**
	 * 接受访问者
	 * @param visitor
	 */
	public void accept(Visitor visitor);
}

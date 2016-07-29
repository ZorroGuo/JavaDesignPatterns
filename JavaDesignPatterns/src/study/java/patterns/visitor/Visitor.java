package study.java.patterns.visitor;

import java.util.Collection;

/**
 * Visitor.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface Visitor {
	/**
	 * 访问老板
	 * @param boss
	 */
	public void visitBossInfo(Boss boss);
	
	/**
	 * 访问职员
	 * @param clerk
	 */
	public void visitClerkInfo(Clerk clerk);
	
	/**
	 * 访问人群信息
	 * @param usrList
	 */
	public void visitUsr(Collection usrList);
}

package study.java.patterns.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * VisitorImpl.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class VisitorImpl implements Visitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * study.java.patterns.visitor.Visitor#visitBoss(study.java.patterns.visitor
	 * .Boss)
	 */
	@Override
	public void visitBossInfo(Boss boss) {
		System.out.println("访问老板：老板姓名-" + boss.getName() + ", 老板公司名-" + boss.getCompanyName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * study.java.patterns.visitor.Visitor#visitClerk(study.java.patterns.visitor
	 * .Clerk)
	 */
	@Override
	public void visitClerkInfo(Clerk clerk) {
		System.out.println("访问职员：职员姓名-" + clerk.getName() + ", 职员薪水-" + clerk.getSlary());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see study.java.patterns.visitor.Visitor#visitUsr(java.util.Collection)
	 */
	@Override
	public void visitUsr(Collection usrList) {
		Iterator iterator = usrList.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable) {
				((Visitable) o).accept(this);
			}
		}
	}

}

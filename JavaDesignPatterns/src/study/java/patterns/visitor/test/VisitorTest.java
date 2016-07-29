package study.java.patterns.visitor.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import study.java.patterns.visitor.Boss;
import study.java.patterns.visitor.Clerk;
import study.java.patterns.visitor.Visitor;
import study.java.patterns.visitor.VisitorImpl;

/**
 * VisitorTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class VisitorTest {

	@Test
	public void test() {
		Boss boss = new Boss("老板A", "皮包股份有限公司");
		Clerk clerk = new Clerk("职员B", (float) 3500.00);
		Visitor visitor = new VisitorImpl();
		
		// 对象accept方法测试
		boss.accept(visitor);
		clerk.accept(visitor);
		
		// 访问者访问
		System.out.println("=======================");
        List usrList = new ArrayList();
        usrList.add(new Boss("老板A", "皮包股份有限公司A"));
        usrList.add(new Clerk("职员A", (float) 3000.00));
        usrList.add(new Boss("老板B", "皮包股份有限公司B"));
        usrList.add(new Clerk("职员B", (float) 3500.00));
        visitor.visitUsr(usrList);
	}

}

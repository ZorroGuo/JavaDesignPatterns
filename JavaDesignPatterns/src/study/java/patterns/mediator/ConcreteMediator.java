package study.java.patterns.mediator;

/**
 * ConcreteMediator.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ConcreteMediator extends Mediator {
	private Colleague colleagueA;
	private Colleague colleagueB;
	
	public ConcreteMediator() {
		colleagueA = new ColleagueA();
		colleagueB = new ColleagueB();
	}
	

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.mediator.Mediator#notice(java.lang.String)
	 */
	@Override
	public void notice(String command) {
		if("A".equals(command)) {
			colleagueA.doAction();
		} else if("B".equals(command)) {
			colleagueB.doAction();
		} else {
			System.out.println("指令待处理");
		}
	}

}

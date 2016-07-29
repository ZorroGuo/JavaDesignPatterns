package study.java.patterns.mediator;

/**
 * ColleagueA.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ColleagueA extends Colleague {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.mediator.Colleague#doAction(java.lang.String)
	 */
	@Override
	public void doAction() {
		System.out.println("A开始行动");
	}

}

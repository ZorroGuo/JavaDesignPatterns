package study.java.patterns.mediator;

/**
 * ColleagueB.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ColleagueB extends Colleague {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.mediator.Colleague#doAction(java.lang.String)
	 */
	@Override
	public void doAction() {
		System.out.println("B开始行动");
	}	

}

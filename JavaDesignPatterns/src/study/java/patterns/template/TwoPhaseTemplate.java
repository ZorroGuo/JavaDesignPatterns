package study.java.patterns.template;

/**
 * TwoPhaseTemplate.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class TwoPhaseTemplate extends Template {

	/* (non-Javadoc)
	 * @see java.study.patterns.template.Template#execute()
	 */
	@Override
	public void execute() {
		System.out.println("我是二阶段模板");
		prepare();
		sumbmit();
	}

	private void sumbmit() {
		System.out.println("交易提交");
	}

}

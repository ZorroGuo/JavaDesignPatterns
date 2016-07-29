package study.java.patterns.strategy;

/**
 * StrategyB.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class StrategyB extends Strategy {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.strategy.Strategy#useStrategy()
	 */
	@Override
	public void useStrategy() {
		System.out.println("使用策略B");
	}

}

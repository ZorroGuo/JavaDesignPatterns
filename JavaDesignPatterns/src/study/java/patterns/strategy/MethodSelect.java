package study.java.patterns.strategy;

/**
 * MethodSelect.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class MethodSelect {
	
	private Strategy strategy;
	
	public MethodSelect(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void selectMethod() {
		strategy.useStrategy();
	}

	/**
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}

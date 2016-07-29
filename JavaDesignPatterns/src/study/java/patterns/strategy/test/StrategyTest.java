package study.java.patterns.strategy.test;

import org.junit.Test;

import study.java.patterns.strategy.MethodSelect;
import study.java.patterns.strategy.StrategyA;
import study.java.patterns.strategy.StrategyB;

/**
 * StrategyTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class StrategyTest {

	@Test
	public void test() {
		MethodSelect ms1 = new MethodSelect(new StrategyA());
		ms1.selectMethod();
		
		MethodSelect ms2 = new MethodSelect(new StrategyB());
		ms2.selectMethod();
	}

}

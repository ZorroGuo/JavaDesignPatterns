package study.java.patterns.interpreter.test;

import org.junit.Test;

import study.java.patterns.interpreter.AdvanceExpression;
import study.java.patterns.interpreter.Context;
import study.java.patterns.interpreter.Expression;
import study.java.patterns.interpreter.SimpleExpression;

/**
 * InterpreterTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class InterpreterTest {

	@Test
	public void test() {
		Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());
        
        for (Expression eps : ctx.getList()) {
            eps.interpret(ctx);
        }

	}

}

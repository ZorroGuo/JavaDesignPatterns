package study.java.patterns.interpreter;

/**
 * SimpleExpression.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class SimpleExpression extends Expression {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.interpreter.Expression#interpret(cn.maomao.study.patterns.interpreter.Context)
	 */
	@Override
	public void interpret(Context context) {
		System.out.println("简单解析器");
	}

}

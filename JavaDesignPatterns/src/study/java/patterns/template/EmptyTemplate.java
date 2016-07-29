package study.java.patterns.template;

/**
 * EmptyTemplate.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class EmptyTemplate extends Template {

	/* (non-Javadoc)
	 * @see java.study.patterns.template.Template#execute()
	 */
	@Override
	public void execute() {
		System.out.println("我是空模板");
	}

}

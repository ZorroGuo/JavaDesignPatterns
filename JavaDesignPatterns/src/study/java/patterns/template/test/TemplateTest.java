package study.java.patterns.template.test;

import org.junit.Test;

import study.java.patterns.template.EmptyTemplate;
import study.java.patterns.template.Template;
import study.java.patterns.template.TwoPhaseTemplate;

/**
 * TemplateTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class TemplateTest {

	@Test
	public void test() {
		Template template1 = new EmptyTemplate();
		template1.execute();
		
		Template template2 = new TwoPhaseTemplate();
		template2.execute();
	}

}

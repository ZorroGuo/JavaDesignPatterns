package study.java.patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Context.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Context {
	private String content;
	
	private List<Expression> list = new ArrayList();

	public List<Expression> getList() {
		return list;
	}
	
	public void add(Expression eps) {
		list.add(eps);
	}
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}

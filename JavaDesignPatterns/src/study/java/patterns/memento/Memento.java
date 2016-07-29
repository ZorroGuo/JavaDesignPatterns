package study.java.patterns.memento;

/**
 * Memento.java
 * <p>
 * Created on 2016年7月28日备忘录
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}

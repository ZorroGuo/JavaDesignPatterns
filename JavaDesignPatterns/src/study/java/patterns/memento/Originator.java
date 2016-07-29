package study.java.patterns.memento;

/**
 * Originator.java
 * <p>
 * Created on 2016年7月28日 原发器
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Originator {
	private String state;

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
	
	public void showState() {
		System.out.println("当前状态为：" + state);
	}
	
	/**
	 * 创建备忘录
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}
	
	/**
	 * 获取备忘录信息
	 * @param memento
	 */
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
}

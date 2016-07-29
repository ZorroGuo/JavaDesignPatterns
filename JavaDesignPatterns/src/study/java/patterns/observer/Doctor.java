package study.java.patterns.observer;

/**
 * Doctor.java
 * <p>
 * Created on 2016年7月28日 观察者-医生
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface Doctor {
	
	/**
	 * 医生接到患者求救信息，采取行动
	 * @param patient
	 */
	public void doAction(Patient patient);
}

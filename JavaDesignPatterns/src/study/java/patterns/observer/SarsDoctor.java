package study.java.patterns.observer;

/**
 * SarsDoctor.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class SarsDoctor implements Doctor {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.observer.Doctor#doAction(cn.maomao.study.patterns.observer.Patient)
	 */
	@Override
	public void doAction(Patient patient) {
		String help = patient.getHelp();
		if("normal".equals(help)) {
			System.out.println("一切正常，SARS医生待命中");
		} else if("sars".equals(help)) {
			System.out.println("病人感染sars病毒，SARS医生紧急出动抢救");
		} else {
			System.out.println("非正常指令，SARS医生无需理会");
		}
	}

}

package study.java.patterns.observer;

/**
 * SarsPatient.java
 * <p>
 * Created on 2016年7月28日SARS患者
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class SarsPatient extends Patient {
	
	public SarsPatient(Doctor doctor) {
		setDoctors();// 安排医生
		registerDoctors(doctor);// 指定处理医生
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.observer.Patient#sendMessage(java.lang.String)
	 */
	@Override
	public void sendMessage(String help) {
		setHelp(help);// 设置求救信息
		for(int i = 0; i < doctors.size(); i++) {
			Doctor doctor = doctors.get(i);
			doctor.doAction(this);
		}
	}

}

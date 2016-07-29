package study.java.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Patient.java
 * <p>
 * Created on 2016年7月28日监测目标-病人
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public abstract class Patient {
	private String help;// 求救信息
	
	protected List<Doctor> doctors;// 医生信息列表
	
	public abstract void sendMessage(String help);// 患者发出求救信息
	
	public void setDoctors() {
		doctors = new ArrayList<Doctor>();
	}
	
	/**
	 * 安排医生
	 * @param doctor
	 */
	public void registerDoctors(Doctor doctor) {
		this.doctors.add(doctor);
	}
	
	public void unregisterDoctors(Doctor doctor) {
		this.doctors.remove(doctor);
	}

	/**
	 * @return the help
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * @param help the help to set
	 */
	public void setHelp(String help) {
		this.help = help;
	}
	
	
}

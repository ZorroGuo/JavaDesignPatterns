package study.java.patterns.builder;

/**
 * StaffDirector.java
 * <p>
 * Created on 2016年7月25日 职工构建信息
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class StaffDirector {

	public Staff constructStaff(StaffBuilder staffBuilder) {
		staffBuilder.buildName();
		staffBuilder.buildSex();
		staffBuilder.buildBirthDay();
		return staffBuilder.buildStaff();
	}
}

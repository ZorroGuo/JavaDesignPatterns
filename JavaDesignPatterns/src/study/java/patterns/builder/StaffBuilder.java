package study.java.patterns.builder;

/**
 * IStaffBuilder.java
 * <p>
 * Created on 2016年7月25日 职工基本信息设置
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public interface StaffBuilder {
	public void buildName();// 构建姓名
	public void buildSex();// 构建性别
	public void buildBirthDay();// 构建生日
	
	public Staff buildStaff();// 创建员工信息
}

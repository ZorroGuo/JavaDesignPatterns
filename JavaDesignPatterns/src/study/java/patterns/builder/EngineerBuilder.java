package study.java.patterns.builder;

/**
 * EngineerBuilder.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class EngineerBuilder implements StaffBuilder {
	Staff staff;
	
	public EngineerBuilder() {
		staff = new Engineer();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildName()
	 */
	@Override
	public void buildName() {
		System.out.println("设置工程师的姓名");
		staff.setName("工程师姓名：张三");
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildSex()
	 */
	@Override
	public void buildSex() {
		System.out.println("设置工程师的性别");
		staff.setSex("工程师性别：男");
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildBirthDay()
	 */
	@Override
	public void buildBirthDay() {
		System.out.println("设置工程师的生日");
		staff.setBirthDay("工程师生日：1995-10-27");
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildStaff()
	 */
	@Override
	public Staff buildStaff() {
		return staff;
	}

}

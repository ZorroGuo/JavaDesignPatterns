package study.java.patterns.builder;

/**
 * ManagerBuilder.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class ManagerBuilder implements StaffBuilder{
	
	Staff staff;
	
	public ManagerBuilder() {
		staff = new Manager();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildName()
	 */
	@Override
	public void buildName() {
		System.out.println("设置经理的名称");
		staff.setName("经理名称：李四");
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildSex()
	 */
	@Override
	public void buildSex() {
		System.out.println("设置经理的性别");
		staff.setSex("经理的性别：女");
		
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildBirthDay()
	 */
	@Override
	public void buildBirthDay() {
		System.out.println("设置经理的生日");
		staff.setBirthDay("经理的生日：1988-10-11");
	}
	
	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.builder.StaffBuilder#buildStaff()
	 */
	@Override
	public Staff buildStaff() {
		return staff;
	}

}

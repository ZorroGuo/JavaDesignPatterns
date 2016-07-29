package study.java.patterns.bridge;

/**
 * Staff.java
 * <p>
 * Created on 2016年7月25日 职工基本信息
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */

public abstract class Staff {
	private String name;// 姓名
	private String sex;// 性别
	private String birthDay;// 生日
	private String positon;// 职位
	private Work work;// 工作
	
	public abstract void currentWork();// 当前工作

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay
	 *            the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the positon
	 */
	public String getPositon() {
		return positon;
	}

	/**
	 * @param positon the positon to set
	 */
	public void setPositon(String positon) {
		this.positon = positon;
	}

	/**
	 * @return the work
	 */
	public Work getWork() {
		return work;
	}

	/**
	 * @param work the work to set
	 */
	public void setWork(Work work) {
		this.work = work;
	}

}

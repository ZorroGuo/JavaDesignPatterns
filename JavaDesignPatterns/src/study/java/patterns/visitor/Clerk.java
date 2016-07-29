package study.java.patterns.visitor;

/**
 * Clerk.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Clerk implements Visitable {
	private String name;// 姓名
	private float slary;// 薪水
	
	public Clerk(String name, float slary) {
		this.name = name;
		this.slary = slary;
	}

	/* (non-Javadoc)
	 * @see study.java.patterns.visitor.Visitable#accept(study.java.patterns.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitClerkInfo(this);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the slary
	 */
	public float getSlary() {
		return slary;
	}

	/**
	 * @param slary the slary to set
	 */
	public void setSlary(float slary) {
		this.slary = slary;
	}

}

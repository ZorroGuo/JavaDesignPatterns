package study.java.patterns.visitor;

/**
 * Boss.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Boss implements Visitable {
	private String name;// 姓名
	private String companyName;// 公司名
	
	public Boss(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	/* (non-Javadoc)
	 * @see study.java.patterns.visitor.Visitable#accept(study.java.patterns.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitBossInfo(this);
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
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}

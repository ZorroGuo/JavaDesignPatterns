package study.java.patterns.decorator;

import java.math.BigDecimal;

/**
 * DiscountDecorator.java
 * <p>
 * Created on 2016年7月27日 折扣装饰器
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public abstract class DiscountDecorator implements IDiscount {
	
	private IDiscount discount;
	
	public void setDiscount(IDiscount discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.decorator.IDiscount#calDiscountPrice(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal calDiscountPrice(BigDecimal price) {
		return discount.calDiscountPrice(price);
	}

}

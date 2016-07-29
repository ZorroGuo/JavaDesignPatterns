package study.java.patterns.decorator;

import java.math.BigDecimal;

/**
 * WeekenDecorator.java
 * <p>
 * Created on 2016年7月27日 周末折扣，在正常折扣基础上在打8折
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class WeekenDecorator extends DiscountDecorator {
	
	public BigDecimal calDiscountPrice(BigDecimal price) {
		price = super.calDiscountPrice(price);
		price = calWeekenDiscountPrice(price);
		price = price.divide(new BigDecimal("1"), 2, BigDecimal.ROUND_HALF_UP);
		return price;
	}

	/**
	 * 周末折扣
	 * @param price
	 * @return
	 */
	private BigDecimal calWeekenDiscountPrice(BigDecimal price) {
		return price.multiply(new BigDecimal(0.80));
	}
}

package study.java.patterns.decorator;

import java.math.BigDecimal;

/**
 * HolidayDecorator.java
 * <p>
 * Created on 2016年7月27日 节假日折扣
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class HolidayDecorator extends DiscountDecorator {
	public BigDecimal calDiscountPrice(BigDecimal price) {
		price = super.calDiscountPrice(price);
		price = calHolidayDiscountPrice(price);
		price = price.divide(new BigDecimal("1"), 2, BigDecimal.ROUND_HALF_UP);
		return price;
	}

	/**
	 * 计算节假日折扣
	 * @param price
	 * @return
	 */
	private BigDecimal calHolidayDiscountPrice(BigDecimal price) {
		return price.multiply(new BigDecimal(0.70));
	}
}

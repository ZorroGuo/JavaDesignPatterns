package study.java.patterns.decorator;

import java.math.BigDecimal;

/**
 * Discount.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface IDiscount {
	/**
	 * 计算折扣价格
	 * @param price 价格
	 * @return 
	 */
	public BigDecimal calDiscountPrice(BigDecimal price);
}

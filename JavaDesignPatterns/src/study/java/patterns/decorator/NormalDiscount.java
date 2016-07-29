package study.java.patterns.decorator;

import java.math.BigDecimal;

/**
 * NormalDiscount.java
 * <p>
 * Created on 2016年7月27日 正常折扣9折优惠
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class NormalDiscount implements IDiscount {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.maomao.study.patterns.decorator.IDiscount#discount(java.math.BigDecimal
	 * )
	 */
	@Override
	public BigDecimal calDiscountPrice(BigDecimal price) {
		price = price.multiply(new BigDecimal(0.90));
		price = price.divide(new BigDecimal("1"), 2, BigDecimal.ROUND_HALF_UP);
		return price;
	}

}

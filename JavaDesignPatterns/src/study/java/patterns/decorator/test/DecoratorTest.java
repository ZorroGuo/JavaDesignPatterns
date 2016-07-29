package study.java.patterns.decorator.test;

import java.math.BigDecimal;

import org.junit.Test;

import study.java.patterns.decorator.HolidayDecorator;
import study.java.patterns.decorator.IDiscount;
import study.java.patterns.decorator.NormalDiscount;
import study.java.patterns.decorator.WeekenDecorator;

/**
 * DecoratorTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class DecoratorTest {

	@Test
	public void test() {
		BigDecimal price = new BigDecimal(100);
		IDiscount discount = new NormalDiscount();
		System.out.println("Normal Price(90%): " + discount.calDiscountPrice(price));
		
		WeekenDecorator weekenDecorator = new WeekenDecorator();
		weekenDecorator.setDiscount(discount);
		System.out.println("Weeken Price(90%->80%): " + weekenDecorator.calDiscountPrice(price));
		
		HolidayDecorator holidayDecorator = new HolidayDecorator();
		holidayDecorator.setDiscount(discount);
		System.out.println("Holiday Price(90%->70%): " + holidayDecorator.calDiscountPrice(price));
	}

}

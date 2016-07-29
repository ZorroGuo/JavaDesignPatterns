package study.java.patterns.State.test;

import org.junit.Test;

import study.java.patterns.State.Rain;
import study.java.patterns.State.Sunshine;
import study.java.patterns.State.Weather;
import study.java.patterns.State.WeatherReport;

/**
 * StateTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class StateTest {

	@Test
	public void test() {
		Weather sunShine = new Sunshine();
		Weather rain = new Rain();
		
		WeatherReport wr = new WeatherReport();
		wr.setWeather(sunShine);
		wr.weatherMessage();
		
		wr.setWeather(rain);
		wr.weatherMessage();
	}

}

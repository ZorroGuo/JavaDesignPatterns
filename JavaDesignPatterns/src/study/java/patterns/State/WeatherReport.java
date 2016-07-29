package study.java.patterns.State;

/**
 * WeatherReport.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class WeatherReport {
	private Weather weather;

	/**
	 * @return the weather
	 */
	public Weather getWeather() {
		return weather;
	}

	/**
	 * @param weather the weather to set
	 */
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
	public void weatherMessage() {
		System.out.println(weather.getWeather());
	}
}

package study.java.patterns.State;

/**
 * Rain.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class Rain implements Weather {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.State.Weather#getWeather()
	 */
	@Override
	public String getWeather() {
		return "今日小雨霏霏";
	}

}

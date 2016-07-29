package study.java.patterns.proxy;

/**
 * NetConnectImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class NetConnectImpl implements INetConnect {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.proxy.INetConnect#connectNet()
	 */
	@Override
	public void connectNet() {
		System.out.println("====被代理的方法Start=====");
		System.out.println("NetConnect->connectNet");
		System.out.println("====被代理的方法End=====");
	}

}

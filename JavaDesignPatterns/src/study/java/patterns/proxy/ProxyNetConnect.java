package study.java.patterns.proxy;

/**
 * ProxyNetConnect.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ProxyNetConnect implements INetConnect {
	private INetConnect netConnect;
	
	public ProxyNetConnect() {
		System.out.println("这是代理类");
		netConnect = new NetConnectImpl();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.proxy.INetConnect#connectNet()
	 */
	@Override
	public void connectNet() {
		System.out.println("====代理方法Start====");
		netConnect.connectNet();
		System.out.println("====代理方法End====");
	}

}

package study.java.patterns.proxy.test;

import org.junit.Test;

import study.java.patterns.proxy.INetConnect;
import study.java.patterns.proxy.NetConnectImpl;
import study.java.patterns.proxy.ProxyNetConnect;

/**
 * ProxyTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ProxyTest {

	@Test
	public void test() {
		INetConnect netConnect1 = new NetConnectImpl();
		netConnect1.connectNet();
		
		INetConnect netConnect2 = new ProxyNetConnect();
		netConnect2.connectNet();
	}

}

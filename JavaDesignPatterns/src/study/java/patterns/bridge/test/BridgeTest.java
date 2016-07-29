package study.java.patterns.bridge.test;

import org.junit.Test;

import study.java.patterns.bridge.Engineer;
import study.java.patterns.bridge.Manager;
import study.java.patterns.bridge.SignInWork;
import study.java.patterns.bridge.SignOutWork;
import study.java.patterns.bridge.Staff;
import study.java.patterns.bridge.Work;

/**
 * BridgeTest.java
 * <p>
 * Created on 2016年7月26日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class BridgeTest {

	@Test
	public void test() {
		Staff engineer = new Engineer();
		Staff manager = new Manager();
		
		Work signIn = new SignInWork();
		Work signOut = new SignOutWork();
		
		signIn.doWork(engineer);
		signIn.doWork(manager);
		
		signOut.doWork(engineer);
		signOut.doWork(manager);
	}

}

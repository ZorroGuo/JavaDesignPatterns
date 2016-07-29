package study.java.patterns.command.test;

import org.junit.Test;

import study.java.patterns.command.Command;
import study.java.patterns.command.CommandImpl;
import study.java.patterns.command.Invoker;
import study.java.patterns.command.Receiver;

/**
 * CommandTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class CommandTest {

	@Test
	public void test() {
		Command command = new CommandImpl(); 
		command.setReceiver(new Receiver());
		
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		invoker.execute();
	}

}

package study.java.patterns.memento.test;

import org.junit.Test;

import study.java.patterns.memento.Caretaker;
import study.java.patterns.memento.Originator;

/**
 * MementoTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class MementoTest {

	@Test
	public void test() {
		Originator ori = new Originator();
		ori.setState("实习期");
		
		Caretaker ctk = new Caretaker();
		ctk.setMemento(ori.createMemento());
		
		ori.setState("转正");
		ori.showState();
		
		ori.setMemento(ctk.getMemento());
		ori.showState();
	}

}

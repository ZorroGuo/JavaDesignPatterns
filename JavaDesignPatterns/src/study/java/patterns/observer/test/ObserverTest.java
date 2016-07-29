package study.java.patterns.observer.test;

import org.junit.Test;

import study.java.patterns.observer.Doctor;
import study.java.patterns.observer.Patient;
import study.java.patterns.observer.SarsDoctor;
import study.java.patterns.observer.SarsPatient;

/**
 * ObserverTest.java
 * <p>
 * Created on 2016年7月28日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ObserverTest {

	@Test
	public void test() {
		Doctor sarsDoctor = new SarsDoctor();
		Patient patient = new SarsPatient(sarsDoctor);
		patient.sendMessage("normal");
		patient.sendMessage("sars");
		patient.sendMessage("joke");
	}

}

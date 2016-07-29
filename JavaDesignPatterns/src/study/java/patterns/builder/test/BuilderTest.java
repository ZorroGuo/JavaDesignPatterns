package study.java.patterns.builder.test;

import org.junit.Test;

import study.java.patterns.builder.EngineerBuilder;
import study.java.patterns.builder.ManagerBuilder;
import study.java.patterns.builder.Staff;
import study.java.patterns.builder.StaffDirector;

/**
 * BuilderTest.java
 * <p>
 * Created on 2016年7月25日 
 * <p>
 * 
 * @author  Shaoqing Guo, guoshaoqing1987@126.com  
 * @version 1.0
 * @since 1.0 
 */

public class BuilderTest {

	@Test
	public void test() {
		StaffDirector director = new StaffDirector();
		Staff engineer = director.constructStaff(new EngineerBuilder());
		System.out.println(engineer.getName());
		System.out.println(engineer.getSex());
		System.out.println(engineer.getBirthDay());
		
		Staff manager = director.constructStaff(new ManagerBuilder());
		System.out.println(manager.getName());
		System.out.println(manager.getSex());
		System.out.println(manager.getBirthDay());
	}

}

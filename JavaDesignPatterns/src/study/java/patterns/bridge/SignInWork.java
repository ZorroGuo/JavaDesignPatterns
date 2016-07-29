package study.java.patterns.bridge;

/**
 * AttendanceWork.java
 * <p>
 * Created on 2016年7月26日 签到
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class SignInWork extends Work {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.bridge.Work#doWork(cn.maomao.study.patterns.bridge.Staff)
	 */
	@Override
	public void doWork(Staff staff) {
		System.out.println(staff.getPositon() + staff.getName() + "正在签到");
	}

}

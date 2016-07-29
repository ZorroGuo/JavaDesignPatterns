package study.java.patterns.command;

/**
 * CommandImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class CommandImpl extends Command {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("我是Command");
		getReceiver().resolveRequest();
	}

}

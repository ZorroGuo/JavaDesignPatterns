package study.java.patterns.chain;

/**
 * ProgrammerRequestHandle.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ProgrammerRequestHandle extends RequestHandle {

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.chain.RequestHandle#handleRequest(cn.maomao.study.patterns.chain.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if(request instanceof SalaryIncRequest) {
			System.out.println("程序员发起加薪申请");
			// 下一流程处理
			reqHandle.handleRequest(request);
		}
	}

}

package study.java.patterns.chain;

/**
 * BossRequestHandle.java
 * <p>
 * Created on 2016年7月27日 老板审批
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class BossRequestHandle extends RequestHandle {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.maomao.study.patterns.chainofresponsibility.RequestHandle#handleRequest
	 * (cn.maomao.study.patterns.chainofresponsibility.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request instanceof SalaryIncRequest) {
			System.out.println("加薪申请-老板审批");
			System.out.println("老板审批同意" + request.getReqUser() + "的加薪申请！");
			System.out.println("恭喜" + request.getReqUser() + "加薪啦！");
			System.out.println("加薪申请-流程结束！！！");
		}
	}

}

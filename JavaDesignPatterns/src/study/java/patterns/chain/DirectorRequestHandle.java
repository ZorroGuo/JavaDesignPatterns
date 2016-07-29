package study.java.patterns.chain;

/**
 * DirectorRequestHandle.java
 * <p>
 * Created on 2016年7月27日 总监审批
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class DirectorRequestHandle extends RequestHandle {

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
			System.out.println("加薪申请-总监审批");
			System.out.println("总监审批同意" + request.getReqUser() + "的加薪申请！");
			// 下一流程处理
			reqHandle.handleRequest(request);
		}
	}

}

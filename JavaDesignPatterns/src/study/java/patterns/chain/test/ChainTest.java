package study.java.patterns.chain.test;

import org.junit.Test;

import study.java.patterns.chain.BossRequestHandle;
import study.java.patterns.chain.DirectorRequestHandle;
import study.java.patterns.chain.PMRequestHandle;
import study.java.patterns.chain.ProgrammerRequestHandle;
import study.java.patterns.chain.Request;
import study.java.patterns.chain.RequestHandle;
import study.java.patterns.chain.SalaryIncRequest;

/**
 * ChainTest.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ChainTest {

	@Test
	public void test() {
		Request request = new SalaryIncRequest();
		request.setReqUser("张三");
		
		// 构建请求责任链
		RequestHandle pgrReqHandler = new ProgrammerRequestHandle();
		RequestHandle pmReqHandler = new PMRequestHandle();
		RequestHandle directorRequestHandle = new DirectorRequestHandle();
		RequestHandle bossRequestHandle = new BossRequestHandle();
		// 程序员->项目经理->总监->老板
		pgrReqHandler.setReqHandle(pmReqHandler);
		pmReqHandler.setReqHandle(directorRequestHandle);
		directorRequestHandle.setReqHandle(bossRequestHandle);
		// 程序员发起加薪申请
		pgrReqHandler.handleRequest(request);
	}

}

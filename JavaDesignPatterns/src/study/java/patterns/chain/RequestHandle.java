package study.java.patterns.chain;

/**
 * RequestHandle.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public abstract class RequestHandle {
	protected RequestHandle reqHandle;

	public abstract void handleRequest(Request request);

	/**
	 * @return the reqHandle
	 */
	public RequestHandle getReqHandle() {
		return reqHandle;
	}

	/**
	 * @param reqHandle the reqHandle to set
	 */
	public void setReqHandle(RequestHandle reqHandle) {
		this.reqHandle = reqHandle;
	}
}

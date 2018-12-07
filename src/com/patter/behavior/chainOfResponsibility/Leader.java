package com.patter.behavior.chainOfResponsibility;

/**
 * 抽象类
 * @author EricMan178
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//责任链后继对象
	public Leader(String name) {
		super();
		this.name = name;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	//处理核心的请假内容
	public abstract void handleRequest(LeaveRequest request);
}

package com.patter.behavior.chainOfResponsibility;

/**
 *  职责链模式（Chain of Responsibility）：使多个对象都有机会处理同一个请求，
 *  从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该
 *  请求，直到有一个对象处理它为止。
 * 
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		Director a = new Director("张三");
		Manager b = new Manager("李四");
		GeneralManager c = new GeneralManager("王五");
		
		//组织责任链对象的关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		//开始请假操作
		LeaveRequest req = new LeaveRequest("tom", 1, "生病了");
		a.handleRequest(req);
	}
}

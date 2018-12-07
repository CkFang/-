package com.patter.structural.proxy;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
 * 这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * @author EricMan1781
 *
 */
public class Demo {

	//静态代理
	public static void main(String[] args) {
		ProxyStar proxy = new ProxyStar(new RealStar());
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.cellectMoney();
		
	}
}

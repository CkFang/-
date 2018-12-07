package com.patter.behavior.mediator;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 * 中介者模式属于行为型模式。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		Mediator m = new President();
		
		Market market = new Market(m);
		Development development = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
	}
}

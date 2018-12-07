package com.patter.behavior.state;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。
 * 这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		Context c = new Context();
		c.setState(new FreeState());
		c.setState(new BookedState());
		c.setState(new CheckedInState());
	}
}

package com.patter.behavior.memento;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，
 * 以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		CareTaker taker = new CareTaker();
		
		Emp e = new Emp("fsa", 18, 900);
		System.out.println(e.toString());
		taker.setMemento(e.memento());
		e.setSalary(400);
		System.out.println(e.toString());
		e.recovery(taker.getMemento());
		System.out.println(e.toString());
	}
}

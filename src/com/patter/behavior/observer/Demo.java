package com.patter.behavior.observer;

import com.patter.behavior.observer.ObserverA;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知它的依赖对象。
 * 观察者模式属于行为型模式。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		//目标对象
		ConcreteSubject sub = new ConcreteSubject();
		//创建多个观察者
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		//将观察者添加到目标对象中
		
		sub.register(o1);
		sub.register(o2);
		sub.register(o3);
		
		//改变目标对象的状态
		sub.setState(3003);
		
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
		//改变目标对象的状态
		sub.setState(30113);
		
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
	}
}

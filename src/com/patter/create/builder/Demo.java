package com.patter.create.builder;

/**
 * 建造者模式
 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		new AirShipDirector(new ConcreteAirshipBuilder()).directAirShip();
	}
}

package com.patter.create.simpleFactory;

/**
 * 简单工厂模式
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		CarFactory car = new CarFactory();
		
		Car car2 = car.getCar("Byd");
		car2.create();
		
		Car car3 = car.getCar("Audi");
		car3.create();
	}
}

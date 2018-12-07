package com.patter.create.factory;

/**
 * 
 * 工厂模式
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		CarFactory car = new CarFactory();

		Car car2 = car.getBydCar();
		car2.create();

		Car car3 = car.getAudiCar();
		car3.create();
	}
}

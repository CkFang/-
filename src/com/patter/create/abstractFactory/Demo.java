package com.patter.create.abstractFactory;

/**
 * 抽象工厂模式
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		CarFactory low = new LowCarFactory();
		CarFactory luxury = new LuxuryCarFactory();
		
		low.createEngine().run();
		low.createSeat().message();
		luxury.createEngine().run();
		luxury.createSeat().message();
	}
}

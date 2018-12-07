package com.patter.structural.decorator;

/**
 * 抽象构建
 * @author EricMan178
 *
 */
public interface Icar {

	void move();
}

//ConcreteComponent 具体构建角色（真实角色）
class Car implements Icar {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("陆地上跑 -------");
	}
	
}

//Decorator装饰角色
class SuperCar implements Icar {
	protected Icar car;

	public SuperCar(Icar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		car.move();
	}
	
}

//具体装饰对象
class FlyCar extends SuperCar {

	public FlyCar(Icar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
}
class WaterCar extends SuperCar {
	
	public WaterCar(Icar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("水里游");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}


package com.patter.create.factory;

import com.patter.create.factory.Car;

public class CarFactory{

	public Car getBydCar() {
		return new Byd();
	}

	public Car getAudiCar() {
		return new Audi();
	}
}

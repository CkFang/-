package com.patter.create.simpleFactory;

public class CarFactory{

	public Car getCar(String type) {
		if (type == null) {
			return null;
		} else if ("Byd".equals(type)) {
			return new Byd();
		} else if ("Audi".equals(type)) {
			return new Audi();
		}
		return null;
	}

}

package com.patter.create.factory;

public interface Car {
	
	public void create();
}

class Byd implements Car {

	@Override
	public void create() {
		System.out.println("工厂模式Byd");
	}
	
}

class Audi implements Car {
	
	@Override
	public void create() {
		System.out.println("工厂模式Audi");
	}
	
}
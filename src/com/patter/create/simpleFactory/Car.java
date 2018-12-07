package com.patter.create.simpleFactory;

public interface Car {
	
	public void create();
}

class Byd implements Car {

	@Override
	public void create() {
		System.out.println("Byd");
	}
	
}

class Audi implements Car {
	
	@Override
	public void create() {
		System.out.println("Audi");
	}
	
}
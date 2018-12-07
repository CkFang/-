package com.patter.create.abstractFactory;

public interface Engine {

	public void run();
}

class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("Engine run lower");
	}
}

class LuxuryEngine implements Engine {
	
	@Override
	public void run() {
		System.out.println("Engine run faster");
	}
}
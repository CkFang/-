package com.patter.behavior.strategy;

public class OldCustomerFewStrategy2 implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打八五折");
		return standardPrice*0.85;
	}

}

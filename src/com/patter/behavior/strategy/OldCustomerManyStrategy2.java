package com.patter.behavior.strategy;

public class OldCustomerManyStrategy2 implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打八折");
		return standardPrice*0.8;
	}

}

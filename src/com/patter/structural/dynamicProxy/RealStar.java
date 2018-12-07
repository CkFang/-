package com.patter.structural.dynamicProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.sing()");
	}

	@Override
	public void cellectMoney() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.cellectMoney()");
	}

}

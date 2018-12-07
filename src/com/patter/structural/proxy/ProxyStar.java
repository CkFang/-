package com.patter.structural.proxy;

public class ProxyStar implements Star {

	private RealStar star;
	
	
	public ProxyStar(RealStar star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void cellectMoney() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.cellectMoney()");
	}


}

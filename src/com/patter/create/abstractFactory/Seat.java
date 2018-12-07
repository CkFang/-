package com.patter.create.abstractFactory;

public interface Seat {

	public void message();
}

class LowSeat implements Seat {

	@Override
	public void message() {
		System.out.println("uncomfortable");
		
	}
	
}

class LuxurySeat implements Seat {
	
	@Override
	public void message() {
		System.out.println("comfortable");
		
	}
	
}
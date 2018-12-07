package com.patter.create.abstractFactory;

public interface CarFactory {

	public Engine createEngine();
	public Seat createSeat();
}

class LowCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}
	
}

class LuxuryCarFactory implements CarFactory {
	
	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LuxuryEngine();
	}
	
	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LuxurySeat();
	}
	
}
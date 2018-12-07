package com.patter.create.builder;

public interface AirshipBuilder {

	public void builderEngine();
	public void builderOrbitalModule();
	public void builderEscapeTower();
}

class ConcreteAirshipBuilder implements AirshipBuilder {

	@Override
	public void builderEngine() {
		System.out.println("构建引擎");
		
	}

	@Override
	public void builderOrbitalModule() {
		// TODO Auto-generated method stub
		System.out.println("构建轨道舱");
	}

	@Override
	public void builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("构建逃逸塔");
	}
	
}

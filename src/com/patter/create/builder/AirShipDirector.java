package com.patter.create.builder;

public class AirShipDirector {

	AirshipBuilder asb;

	public AirShipDirector(AirshipBuilder asb) {
		super();
		this.asb = asb;
	}
	
	public void directAirShip() {
		asb.builderEngine();
		asb.builderEscapeTower();
		asb.builderOrbitalModule();
	}
}

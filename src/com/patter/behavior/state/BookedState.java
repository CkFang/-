package com.patter.behavior.state;

public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间空间");
		
	}

}

package com.patter.behavior.state;

public class Context {

	private State state;
	
	public void setState(State s) {
		System.out.println("状态改变");
		state = s;
		state.handle();
	}
}

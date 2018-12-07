package com.patter.behavior.mediator;

import com.patter.behavior.strategy.Strategy;

public class Context {

	private Strategy strategy;
	
	//构造器注入
	
	//set注入
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}

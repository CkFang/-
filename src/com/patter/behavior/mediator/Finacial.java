package com.patter.behavior.mediator;

public class Finacial implements Department {

	private Mediator m;
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial",this);
	}

	@Override
	public void outAction() {
		System.out.println("资金部汇报工作，");
		//可以调用m的方法
		//m.command("development");
	}

	@Override
	public void selfAction() {
		System.out.println("在数钱");
	}

}

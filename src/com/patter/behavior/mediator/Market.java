package com.patter.behavior.mediator;

public class Market implements Department {

	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market",this);
	}

	@Override
	public void outAction() {
		System.out.println("市场部汇报工作");
		//可以调用m的方法
		m.command("development");
	}

	@Override
	public void selfAction() {
		System.out.println("跑去接项目");
	}

}

package com.patter.behavior.mediator;

public class Development implements Department {

	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development",this);
	}

	@Override
	public void outAction() {
		System.out.println("汇报，没钱了，需要资金支持");
		//可以调用m的方法
		//m.command("development");
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研，开发项目！");
	}

}

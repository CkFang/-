package com.patter.behavior.command;

//命令发起者
public class Invoke {
	
	//也可以通过容器存储多个命令
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	public void call() {
		command.execute();
	}
}

package com.patter.behavior.command;

public interface Command {

	public void execute();
}

class ConcreteCommand implements Command {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//命令执行前可以处理相关的操作
		receiver.action();
		
	}
	
}
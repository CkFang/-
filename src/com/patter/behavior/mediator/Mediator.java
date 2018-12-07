package com.patter.behavior.mediator;

public interface Mediator {

	public void command(String dname);
	public void register(String dname, Department department);

}

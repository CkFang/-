package com.patter.behavior.mediator;

//同事类的接口
public interface Department {

	public void selfAction();//做本部门的事
	public void outAction();//向总经理发出申请
}

package com.patter.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {

	private Map<String, Department> map =  new HashMap<String, Department>();
	@Override
	public void command(String dname) {
		// TODO Auto-generated method stub
		map.get(dname).selfAction();
	}

	@Override
	public void register(String dname, Department department) {
		// TODO Auto-generated method stub
		map.put(dname, department);
	}

}

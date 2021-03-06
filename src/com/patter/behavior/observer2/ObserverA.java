package com.patter.behavior.observer2;

import java.util.Observable;
import java.util.Observer;

import com.patter.behavior.observer2.ConcreteSubject;

public class ObserverA implements Observer{

	private int myState;
	
	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
	}
	
}

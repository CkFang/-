package com.patter.structural.flyWeight;

public interface ChessFlyWeight {

	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色"+color);
		System.out.println("棋子位置"+ c.getX() +"-------"+ c.getY());
		
	}
	
}
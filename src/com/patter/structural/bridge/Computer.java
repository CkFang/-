package com.patter.structural.bridge;

public class Computer {

	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
}

class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售台式机");
	}
}
class Laptop extends Computer{
	
	public Laptop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售笔记本");
	}
}
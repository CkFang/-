package com.patter.structural.bridge;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		new Laptop(new Dell()).sale();
	}
}

package com.patter.structural.flyWeight;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * @author EricMan178
 *
 */
public class Demo {
	public static void main(String[] args) {
		ChessFlyWeight c1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight c2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(c1 == c2);
		
		c1.display(new Coordinate(10, 20));
		c2.display(new Coordinate(20, 20));
	}

}

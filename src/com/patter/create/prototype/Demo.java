package com.patter.create.prototype;

import java.util.Date;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) throws Exception {
		Date date = new Date(2937923749L);
		Sheep s1 = new Sheep("少利",date);
		Sheep s2 = (Sheep)s1.clone();
		date.setTime(555555555555L);
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}

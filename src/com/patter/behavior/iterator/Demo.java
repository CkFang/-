package com.patter.behavior.iterator;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		
		cma.addObject(12);
		cma.addObject(13);
		cma.addObject(22);
		cma.addObject("fdsadf");
		
		
		MyIterator iter = cma.createIterator();
		while (iter.hasNext()) {
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}
}

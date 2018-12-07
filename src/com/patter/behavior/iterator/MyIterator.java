package com.patter.behavior.iterator;

/**
 * 自定义迭代器
 * @author EricMan178
 *
 */
public interface MyIterator {

	void first();
	void next();
	boolean hasNext();
	
	boolean isFirst();
	boolean isLast();
	Object getCurrentObj();
}

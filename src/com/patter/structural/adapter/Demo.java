package com.patter.structural.adapter;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 * 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		new Demo().test(new Adpater());
	}
	
	public void test(Target t) {
		t.handleReq();
	}
}

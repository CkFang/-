package com.patter.create.singleton;

/**
 * 单例模式
 * 多种实现
 * 饿汉式，懒汉式，内部类，静态代码块，枚举
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		Singleton1 i1 = Singleton1.getInstance();
		Singleton1 i2 = Singleton1.getInstance();
		System.out.println(i1);
		System.out.println(i2);
		Singleton2 i21 = Singleton2.getInstance();
		Singleton2 i22 = Singleton2.getInstance();
		System.out.println(i21);
		System.out.println(i22);
		Singleton8 i61 = SingletonFactory.getInstance();
		Singleton8 i62 = SingletonFactory.getInstance();
		System.out.println(i61);
		System.out.println(i62);
		Singleton5 i51 = Singleton5.Singleton;
		Singleton5 i52 = Singleton5.Singleton;
		System.out.println(i51);
		System.out.println(i52);
	}
}

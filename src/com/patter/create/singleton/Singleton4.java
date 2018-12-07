package com.patter.create.singleton;


//static静态代码块实现
public class Singleton4 {

	//私有构造
	private Singleton4() {}
	
	private static Singleton4 s = null;
	
	static {
		s = new Singleton4();
	}
	//静态工厂方法
	public static Singleton4 getInstance() {
		return s;
	}
}

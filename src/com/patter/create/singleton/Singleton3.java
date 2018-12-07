package com.patter.create.singleton;


//静态内部类实现
public class Singleton3 {

	//私有构造
	private Singleton3() {}
	
	//静态内部类
	private static class InnerObject{
		private static Singleton3 s = new Singleton3();
	}
	
	//静态工厂方法
	public static Singleton3 getInstance() {
		return InnerObject.s;
	}
}

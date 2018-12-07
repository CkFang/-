package com.patter.create.singleton;


//懒汉式
public class Singleton2 {

	//私有构造
	private Singleton2() {}
	
	private static Singleton2 s = null;
	
	//静态工厂方法
	public static Singleton2 getInstance() {
		/*synchronized(Singleton2.class) {
			if(s == null) {
				s = new Singleton2();
			}
		}*/
		if (s == null) {
			synchronized(Singleton2.class) {
				if(s == null) {
					s = new Singleton2();
				}
			}
		}
		return s;
	}
}

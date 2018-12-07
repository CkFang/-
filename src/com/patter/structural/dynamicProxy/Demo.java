package com.patter.structural.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		StarHandler handler = new StarHandler(new RealStar());
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[] {Star.class}, handler);
		//proxy.signContract();
		proxy.sing();
	}
}

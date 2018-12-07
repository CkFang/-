package com.patter.structural.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{

	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	
		Object obj = null;
		//方法执行前
		System.out.println("before....");
		if (method.getName().equals("sing")) {
			obj = method.invoke(realStar, args);
			
		}
		//方法执行后
		System.out.println("after....");
		return obj;
	}

}

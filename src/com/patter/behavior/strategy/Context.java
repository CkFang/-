package com.patter.behavior.strategy;

/**
 * 负责和具体的策略类交互
 * 这样的话，具体算法和直接的客户端调用分离，使得算法可以独立于客户端独立的变化
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同策略对象，动态的切换不同的算法
 * @author EricMan178
 *
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void printPrice(double s) {
		System.out.println("报价为：" +strategy.getPrice(s));
	}
}
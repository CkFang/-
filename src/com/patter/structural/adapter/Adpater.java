package com.patter.structural.adapter;

/**
 * 适配器（adpter extends Adpatee 类适配器方式）
 * @author EricMan178
 *
 */
public class Adpater implements Target{

	//对象组合
	private Adpatee adp = new Adpatee();;
	
	//构造器注入
	public Adpater() {
		super();
	}
	
	public Adpater(Adpatee adp) {
		super();
		this.adp = adp;
	}
	//set注入
	public void setAdp(Adpatee adp) {
		this.adp = adp;
	}
	
	@Override
	public void handleReq() {
		// TODO Auto-generated method stub
		adp.request();
	}

}

package com.patter.structural.bridge;

/**
 * 品牌
 * @author EricMan178
 *
 */
public interface Brand {

	void sale();
}

class Lenove implements Brand {

	@Override
	public void sale() {
		System.out.println("销售联想电脑");
	}
	
}
class Asus implements Brand {
	
	@Override
	public void sale() {
		System.out.println("销售华硕电脑");
	}
	
}
class Dell implements Brand {
	
	@Override
	public void sale() {
		System.out.println("销售戴尔电脑");
	}
	
}
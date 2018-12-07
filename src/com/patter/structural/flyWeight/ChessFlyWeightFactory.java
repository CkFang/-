package com.patter.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author EricMan178
 *
 */
public class ChessFlyWeightFactory {

	//享元池
	private static Map<String,ChessFlyWeight> map = new HashMap<>();
	
	public static ChessFlyWeight getChess(String color) {
		if(map.get(color) != null) {
			return map.get(color);
		}else {
			ConcreteChess cf = new ConcreteChess(color);
			map.put(color, cf);
			return cf;
		}
	}
}

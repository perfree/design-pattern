package com.perfree.builder;

/**
 * 执行造汽车的动作
 * @author yinpengfei
 *
 */
public class Director {
	
	public Car createCarByDirector(MyCarBuilder myCarBuilder) {
		myCarBuilder.buildColor();
		myCarBuilder.buildSeatNum();
		myCarBuilder.buildSpeed();
		return myCarBuilder.createCar();
	}
}

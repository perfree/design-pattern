package com.perfree.builder;

public class MyCarBuilder implements BuilderCar {

	private Car car;
	
	public MyCarBuilder() {
		car = new Car();
	}
	
	@Override
	public void buildColor() {
		car.setColor("白色");
	}

	@Override
	public void buildSeatNum() {
		car.setSeatNum("5座");
	}

	@Override
	public void buildSpeed() {
		car.setSpeed("最高240公里/小时");
	}

	@Override
	public Car createCar() {
		return car;
	}

}

package com.perfree.builder;

/**
 * 建造者模式<br>
 * 测试类
 * @author yinpengfei
 */
public class Main {
	
	public static void main(String[] args) {
		Director director = new Director();
		Car car = director.createCarByDirector(new MyCarBuilder());
		System.out.println(car.getColor());
		System.out.println(car.getSeatNum());
		System.out.println(car.getSpeed());
	}
}

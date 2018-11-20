package com.perfree.builder;

/**
 * 定义创建汽车的标准接口
 * @author yinpengfei
 * 先创建各种部位,最后返回汽车类
 */
public interface BuilderCar {
	
	public void buildColor();
	
	public void buildSeatNum();
	
	public void buildSpeed();
	
	public Car createCar();
}

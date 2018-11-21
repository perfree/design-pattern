package com.perfree.adaper;

public class Adapter extends Adapee implements Target{

	/**
	 * 由于源类Adaptee没有方法fun2,因此适配器补充上这个方法
	 */
	@Override
	public void fun2() {
		System.out.println("fun2");
	}

}

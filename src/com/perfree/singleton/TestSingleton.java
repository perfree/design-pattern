package com.perfree.singleton;

/**
 * 单例模式
 * @author yinpengfei
 * 在内部创建一个实例，构造器全部设置为private，所有方法均在该实例上改动，<br>
 * 在创建上要注意类的实例化只能执行一次，可以采用许多种方法来实现，如Synchronized关键字，<br>
 * 或者利用内部类等机制来实现。
 */
class Singleton{
	private Singleton() {
		System.out.println("单例模式");
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance(){
		return instance ;
	}
}

public class TestSingleton {
	public static void main(String[] args) {
		//只能实例化一次,所以下边三次调用都只会输出一句话
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
	
}
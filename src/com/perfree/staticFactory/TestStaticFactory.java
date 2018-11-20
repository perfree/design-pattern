package com.perfree.staticFactory;
/**
 * 静态工厂模式
 * @author yinpengfei
 * 常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化。
 */

/**接口Food*/
interface Food{}

/**A继承Food接口,并添加构造函数以分辨结果*/
class A implements Food{
	public A() {
		System.out.println("aaaa");
	}
}

/**B继承Food接口,并添加构造函数以分辨结果*/
class B implements Food{
	public B() {
		System.out.println("bbbb");
	}
}

/**C继承Food接口,并添加构造函数以分辨结果*/
class C implements Food{
	public C() {
		System.out.println("cccc");
	}
}

/**静态工厂,私有化构造函数,提供创建对应实现类的静态方法*/
class StaticFactory {
	private StaticFactory() {}
	
	public static Food getA() {
		return new A();
	}
	
	public static Food getB() {
		return new B();
	}
	
	public static Food getC() {
		return new C();
	}

}

/**测试调用*/
public class TestStaticFactory{
	public static void main(String[] args) {
		StaticFactory.getA();
		StaticFactory.getB();
		StaticFactory.getC();
	}
}

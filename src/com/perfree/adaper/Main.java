package com.perfree.adaper;

/**
 *	适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *  @author yinpengfei
 *	目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类<br>
 *	源(Adapee)角色：现在需要适配的接口<br>
 *	适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。<br>
 */
public class Main {
	
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.fun1();
		adapter.fun2();
	}
}

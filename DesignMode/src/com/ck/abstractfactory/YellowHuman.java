package com.ck.abstractfactory;

public abstract class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄种人皮肤是黄色的");
		
	}

	@Override
	public void talk() {
		System.out.println("黄种人说中文");
		
	}

}

package com.ck.abstractfactory;

public abstract class whiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白种人皮肤是白色的");
		
	}

	@Override
	public void talk() {
		System.out.println("白人说话单字节");
		
	}

}

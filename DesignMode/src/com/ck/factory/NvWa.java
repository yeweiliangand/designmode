package com.ck.factory;
/**
 *	工厂模式
 * 女娲造人
 * @author win10
 * TODO 
 * 此外还有一种简单工厂模式，去掉工厂抽象类，将方法前加上static,类图会简单化，但是扩展性相对较差
 */
public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory factory =new HumanFactory();
		Human yellowHuman=factory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}

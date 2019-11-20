package com.ck.abstractfactory;
/**
 *	抽象工厂模式
 * 女娲造人
 * @author win10
 * TODO 
 * 横向扩展容易，纵向扩展困难
 */
public class NvWa {
	public static void main(String[] args) {
		FemaleHumanFactory factory =new FemaleHumanFactory();
		Human feHuman =factory.createYellowHUman();
		feHuman.getColor();
		feHuman.getSex();
		feHuman.talk();
		
	}

}

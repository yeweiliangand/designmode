package com.ck.abstractfactory;
/**
 *	���󹤳�ģʽ
 * Ů�����
 * @author win10
 * TODO 
 * ������չ���ף�������չ����
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

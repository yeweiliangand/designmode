package com.ck.factory;
/**
 *	����ģʽ
 * Ů�����
 * @author win10
 * TODO 
 * ���⻹��һ�ּ򵥹���ģʽ��ȥ�����������࣬������ǰ����static,��ͼ��򵥻���������չ����Խϲ�
 */
public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory factory =new HumanFactory();
		Human yellowHuman=factory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}

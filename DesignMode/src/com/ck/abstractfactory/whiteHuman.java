package com.ck.abstractfactory;

public abstract class whiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("������Ƥ���ǰ�ɫ��");
		
	}

	@Override
	public void talk() {
		System.out.println("����˵�����ֽ�");
		
	}

}

package com.ck.builder;

import java.util.ArrayList;

public abstract class CarBuilder {

	//����һ��ģ�ͣ���һ����װ˳��
	public abstract  void setSequence(ArrayList<String> sequence);

	public abstract CarModel getCarModel();

}

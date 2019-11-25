package com.ck.builder;

import java.util.ArrayList;

public abstract class CarBuilder {

	//建造一个模型，给一个组装顺序
	public abstract  void setSequence(ArrayList<String> sequence);

	public abstract CarModel getCarModel();

}

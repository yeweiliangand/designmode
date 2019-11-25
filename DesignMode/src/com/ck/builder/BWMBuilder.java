package com.ck.builder;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder{

	private BWMModel model =new BWMModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		model.setSequence(sequence);
		
	}

	@Override
	public CarModel getCarModel() {

		return model;
	}

}

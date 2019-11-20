package com.ck.abstractfactory;

public class FemaleHumanFactory implements AbstractHumanFactory{

	@Override
	public Human createWhiteHUman() {
		return null;
	}

	@Override
	public Human createYellowHUman() {

		return new FemaleYellowHuman();
	}

	@Override
	public Human createBlackHUman() {
		// TODO Auto-generated method stub
		return null;
	}



}

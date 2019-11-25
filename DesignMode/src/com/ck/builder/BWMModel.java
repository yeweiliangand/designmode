package com.ck.builder;

public class BWMModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("bwm Æô¶¯");
		
	}

	@Override
	protected void stop() {
		System.out.println("bwm Í£Ö¹");
		
	}

	@Override
	protected void alarm() {
		System.out.println("bwm ßÌµÑ");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("bwm boon");
		
	}

}

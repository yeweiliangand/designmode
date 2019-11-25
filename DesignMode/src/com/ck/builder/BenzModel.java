package com.ck.builder;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("benz Æô¶¯");
		
	}

	@Override
	protected void stop() {
		System.out.println("benz Í£Ö¹");
		
	}

	@Override
	protected void alarm() {
		System.out.println("benz ßÌµÑ");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("benz boon");
		
	}
	

}

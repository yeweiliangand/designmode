package com.ck.builder;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("benz ����");
		
	}

	@Override
	protected void stop() {
		System.out.println("benz ֹͣ");
		
	}

	@Override
	protected void alarm() {
		System.out.println("benz �̵�");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("benz boon");
		
	}
	

}

package com.ck.singleton;
/**
 * ����ģʽ
 * @author win10
 * TODO
 */
public class Emperor {

	private static Emperor emperor=new Emperor();

	private Emperor() {
	}
	public static Emperor getInstance() {
		return emperor;
	}
	public  void say() {
		System.out.println("i am emperor");
	}
}

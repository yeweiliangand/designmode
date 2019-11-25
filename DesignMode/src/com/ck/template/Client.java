package com.ck.template;
/**
 * 模板模式 制定一套模板代码
 * @author micromaker
 * TODO 封装不变部分，扩展可变部分
 */
public class Client {
	public static void main(String[] args) {
		HummerModel h1model=new HummerH1Model();
		h1model.run();
	}

}

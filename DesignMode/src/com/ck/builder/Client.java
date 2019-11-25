package com.ck.builder;

import java.util.ArrayList;
/**
 * 
 * @author micromaker
 * TODO  按照客户的要求定制，进行封装一个builder，
 * 优点：封装性强，易扩展
 */
public class Client {
	
	public static void main(String[] args) {
		BenzModel model =new BenzModel();
		ArrayList<String> list =new ArrayList<String>();
		list.add("boom");
		list.add("start");
		list.add("stop");
		BWMBuilder builder =new BWMBuilder();
		builder.setSequence(list);
		BWMModel bmwModel =(BWMModel) builder.getCarModel();
		bmwModel.run();
	}

}

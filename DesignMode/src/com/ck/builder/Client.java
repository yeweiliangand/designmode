package com.ck.builder;

import java.util.ArrayList;
/**
 * 
 * @author micromaker
 * TODO  ���տͻ���Ҫ���ƣ����з�װһ��builder��
 * �ŵ㣺��װ��ǿ������չ
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

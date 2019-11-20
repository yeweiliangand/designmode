package com.ck.singleton;
/**
 * 固定数量的多例模式(有上限的多例模式)
 * @author win10
 * TODO
 * 可以修正单例模式存在的性能问题，提高系统响应速度，例如读取文件，在内存中启动固定数量的reader实例
 */

import java.util.ArrayList;
import java.util.Random;

public class DoubleEmperor {
	//定义最多产生的实例
	private static int maxNumEmperor=2;
	//每个皇帝都有名字，使用list存储
	private static ArrayList<String> nameList= new ArrayList<String>();
	//定义一个列表，存储皇帝实例
	private static ArrayList<DoubleEmperor> emperorList =new ArrayList<DoubleEmperor>();
	//当前皇帝序列号
	private static int countNumOfEmperor=0;
	static {
		for (int i = 0; i < maxNumEmperor; i++) {
			emperorList.add(new DoubleEmperor("皇帝"+(i+1)));		
		}	
	}
	private DoubleEmperor() {

	}
	private DoubleEmperor(String name) {
		nameList.add(name);
	}	
	
	//随机获得一个皇帝对象
	public static DoubleEmperor getInstance() {
		Random random =new Random();
		countNumOfEmperor=random.nextInt(maxNumEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	public void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
	
}

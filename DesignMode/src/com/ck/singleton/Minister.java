package com.ck.singleton;
/**
 * 单例模式
 * @author win10
 * TODO
 * 优点：减少内存开支，尤其是一个对象的产生需要较多的资源的时候
 * 缺点：扩展困难，线程不安全，需要优化
 * 适用环境：要求生成唯一序列号的环境，
 * 需要共享访问点或共享数据
 */
public class Minister {
	//单例模式测试
//	public static void main(String[] args) {
//		for(int day=0;day<3;day++) {
//			Emperor emperor =Emperor.getInstance();
//			emperor.say();
//		}
//	}
	
	public static void main(String[] args) {
		//定义5个大臣
		int ministerNum=5;
		for (int i = 0; i <ministerNum; i++) {
			DoubleEmperor doubleEmperor=DoubleEmperor.getInstance();
			System.out.print("第"+(i+1)+"个大臣参拜的是：");
			doubleEmperor.say();
		}
	}

}

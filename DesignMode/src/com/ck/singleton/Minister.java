package com.ck.singleton;
/**
 * ����ģʽ
 * @author win10
 * TODO
 * �ŵ㣺�����ڴ濪֧��������һ������Ĳ�����Ҫ�϶����Դ��ʱ��
 * ȱ�㣺��չ���ѣ��̲߳���ȫ����Ҫ�Ż�
 * ���û�����Ҫ������Ψһ���кŵĻ�����
 * ��Ҫ������ʵ��������
 */
public class Minister {
	//����ģʽ����
//	public static void main(String[] args) {
//		for(int day=0;day<3;day++) {
//			Emperor emperor =Emperor.getInstance();
//			emperor.say();
//		}
//	}
	
	public static void main(String[] args) {
		//����5����
		int ministerNum=5;
		for (int i = 0; i <ministerNum; i++) {
			DoubleEmperor doubleEmperor=DoubleEmperor.getInstance();
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			doubleEmperor.say();
		}
	}

}

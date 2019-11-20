package com.ck.singleton;
/**
 * �̶������Ķ���ģʽ(�����޵Ķ���ģʽ)
 * @author win10
 * TODO
 * ������������ģʽ���ڵ��������⣬���ϵͳ��Ӧ�ٶȣ������ȡ�ļ������ڴ��������̶�������readerʵ��
 */

import java.util.ArrayList;
import java.util.Random;

public class DoubleEmperor {
	//������������ʵ��
	private static int maxNumEmperor=2;
	//ÿ���ʵ۶������֣�ʹ��list�洢
	private static ArrayList<String> nameList= new ArrayList<String>();
	//����һ���б��洢�ʵ�ʵ��
	private static ArrayList<DoubleEmperor> emperorList =new ArrayList<DoubleEmperor>();
	//��ǰ�ʵ����к�
	private static int countNumOfEmperor=0;
	static {
		for (int i = 0; i < maxNumEmperor; i++) {
			emperorList.add(new DoubleEmperor("�ʵ�"+(i+1)));		
		}	
	}
	private DoubleEmperor() {

	}
	private DoubleEmperor(String name) {
		nameList.add(name);
	}	
	
	//������һ���ʵ۶���
	public static DoubleEmperor getInstance() {
		Random random =new Random();
		countNumOfEmperor=random.nextInt(maxNumEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	public void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
	
}

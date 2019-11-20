package com.ck.factory.sington;

import java.lang.reflect.Constructor;

/**
 * ʹ�ù���ģʽ������������
 * @author win10
 * TODO
 */
public class SingletonFactory {
	private static Singleton singleton;
	static {
		try {
			Class cl= Class.forName(Singleton.class.getName());
			//��ȡ�޲ι���
			Constructor constructor = cl.getDeclaredConstructor();
			//�����޲ι����ǿɷ��ʵ�
			constructor.setAccessible(true);
			singleton=(Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
	public static void main(String[] args) {
		
		singleton.doSomeThing();
	}

	
}

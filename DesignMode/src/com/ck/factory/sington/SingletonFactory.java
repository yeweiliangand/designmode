package com.ck.factory.sington;

import java.lang.reflect.Constructor;

/**
 * 使用工厂模式建立单例对象
 * @author win10
 * TODO
 */
public class SingletonFactory {
	private static Singleton singleton;
	static {
		try {
			Class cl= Class.forName(Singleton.class.getName());
			//获取无参构造
			Constructor constructor = cl.getDeclaredConstructor();
			//设置无参构造是可访问的
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

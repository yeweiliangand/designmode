package com.ck.factory.delay;
/**
 * 延迟加载工厂类
 */
import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
	private static final Map<String, Product> prMap=new HashMap<String, Product>();
	public static synchronized Product createProduct(String type) throws Exception{
		Product product=null;
		if(prMap.containsKey(type)) {
			product=prMap.get(type);
		}else {
			if(type.equals("product")) {
				product=new ConcreteProduct();
			}
			prMap.put(type, product);
		}
		return product;
	}

}

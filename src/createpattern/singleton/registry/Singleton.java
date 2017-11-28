package createpattern.singleton.registry;

import java.util.HashMap;

public class Singleton {
	/**
	 * 用来存放对应关系
	 */
	@SuppressWarnings("rawtypes")
	private static HashMap sinRegistry = new HashMap();

	/**
	 * 受保护的构造函数
	 */
	protected Singleton() {
		System.out.println("registry super Singleton");
	}

	@SuppressWarnings("unchecked")
	public static Singleton getInstance(String name) {
		if (name == null) {
			name = "singleton.registry.Singleton";
		}
		if (sinRegistry.get(name) == null) {
			try {
				sinRegistry.put(name, Class.forName(name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (Singleton) (sinRegistry.get(name));
	}
	
	public static void main(String[] args) {
		Singleton.getInstance(null);
	}
}
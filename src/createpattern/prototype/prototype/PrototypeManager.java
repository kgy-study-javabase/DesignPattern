package createpattern.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	private static PrototypeManager pm;

	private Map<String, Object> prototypes = null;

	private PrototypeManager() {
		prototypes = new HashMap<String, Object>();
	}

	// 使用单例模式来得到原型管理器的唯一实例
	public static PrototypeManager getManager() {
		if (pm == null) {
			pm = new PrototypeManager();
		}
		return pm;
	}

	public void register(String name, Object prototype) {
		prototypes.put(name, prototype);
	}

	public void unregister(String name) {
		prototypes.remove(name);
	}

	public Prototype getPrototype(String name) {
		if (prototypes.containsKey(name)) {
			// 将清单中对应原型的复制品返回给客户
			return (Prototype) ((Prototype) prototypes.get(name)).clone();
		} else {
			Prototype object = null;
			try {
				object = (Prototype) Class.forName(name).newInstance();
				register(name, object);
			} catch (Exception e) {
				System.err.println("Class " + name + "没有定义!");
			}
			return object;
		}
	}

	public static void main(String[] args) {
		// 先new一个具体原型角色作为样本
		Prototype p = new Prototype();
		p.name = "p";
		System.out.println("==p.name==" + p.name);

		// 使用原型管理器后，客户获得对象的方式
		Prototype prototype = PrototypeManager.getManager().getPrototype("prototype.prototype.Prototype");
		prototype.name = "prototype";
		System.out.println("==p.name==" + p.name);
		System.out.println("==prototype.name==" + prototype.name);
	}
}
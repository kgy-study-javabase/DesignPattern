package behaviorpattern.iterator.client;

import behaviorpattern.iterator.concretecontainer.ConcreteAggregate;
import behaviorpattern.iterator.container.Aggregate;
import behaviorpattern.iterator.iterator.Iterator;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/chenhuade85/article/details/8146992
 * http://blog.csdn.net/chenhuade85/article/category/1271813
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("小明");
		ag.add("小红");
		ag.add("小刚");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}
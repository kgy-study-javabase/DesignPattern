package structurepattern.proxy.client;

import structurepattern.proxy.agenttheme.Proxy;
import structurepattern.proxy.realtheme.People;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22974405
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		People people1 = new People();
		people1.setCash(60000);
		people1.setUsername("jeck");

		People people2 = new People();
		people2.setCash(40000);
		people2.setUsername("rose");

		People people3 = new People();
		people3.setCash(0);
		people3.setUsername("tom");
		people3.setVip("vip");

		Proxy proxyBuy = new Proxy();
		proxyBuy.setPeople(people1);
		proxyBuy.buyMyCar();

		proxyBuy.setPeople(people2);
		proxyBuy.buyMyCar();

		proxyBuy.setPeople(people3);
		proxyBuy.buyMyCar();
	}
}
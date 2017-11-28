package createpattern.factory.abstractfactory.client;

import createpattern.factory.abstractfactory.concretefactory.FactoryBMW320;
import createpattern.factory.abstractfactory.concretefactory.FactoryBMW523;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/44976775
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		// 生产宝马320系列配件
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createEngine();
		factoryBMW320.createAircondition();

		// 生产宝马523系列配件
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		factoryBMW523.createEngine();
		factoryBMW523.createAircondition();
	}
}
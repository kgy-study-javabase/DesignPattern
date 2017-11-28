package structurepattern.flyweight.client;

import structurepattern.flyweight.flyweight.Flyweight;
import structurepattern.flyweight.flyweightfactory.FlyweightFactory;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22908915
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	FlyweightFactory factory = new FlyweightFactory();

	Flyweight fly1;

	Flyweight fly2;

	Flyweight fly3;

	Flyweight fly4;

	Flyweight fly5;

	Flyweight fly6;

	/** Creates a new instance of FlyweightPattern */
	public Client() {
		fly1 = factory.getFlyWeight("Google");
		fly2 = factory.getFlyWeight("Qutr");
		fly3 = factory.getFlyWeight("Google");
		fly4 = factory.getFlyWeight("Google");
		fly5 = factory.getFlyWeight("Google");
		fly6 = factory.getFlyWeight("Google");
	}

	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}

	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		Client fp = new Client();
		fp.showFlyweight();
	}
}
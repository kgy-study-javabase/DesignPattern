package structurepattern.decorator.app.client;

import structurepattern.decorator.app.concretedecorator.Chilli;
import structurepattern.decorator.app.concretedecorator.Lettuce;
import structurepattern.decorator.app.passivedecorator.ChickenBurger;
import structurepattern.decorator.app.passivedecorator.Humburger;

/**
 * 测试类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22713711
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Test {
	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger();
		System.out.println(humburger.getName() + "  价钱：" + humburger.getPrice());
		Lettuce lettuce = new Lettuce(humburger);
		System.out.println(lettuce.getName() + "  价钱：" + lettuce.getPrice());
		Chilli chilli = new Chilli(humburger);
		System.out.println(chilli.getName() + "  价钱：" + chilli.getPrice());
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName() + "  价钱：" + chilli2.getPrice());
	}
}
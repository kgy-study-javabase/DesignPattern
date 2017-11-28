package structurepattern.decorator.decorator.concretedecorator;

import structurepattern.decorator.decorator.decorator.Decorator;
import structurepattern.decorator.decorator.passivedecorator.Human;

/**
 * 具体装饰角色(Concrete Decorator)
 * 
 * 下面定义三种装饰，这是第一个，第二个第三个功能依次细化，即装饰者的功能越来越多
 * 
 * @author Administrator
 */
public class DecoratorZero extends Decorator {
	public DecoratorZero(Human human) {
		super(human);
	}

	public void goHome() {
		System.out.println("进房子。。");
	}

	public void findMap() {
		System.out.println("书房找找Map。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		goHome();
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		findMap();
	}
}
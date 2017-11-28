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
public class DecoratorFirst extends Decorator {
	public DecoratorFirst(Human human) {
		super(human);
	}

	public void goClothespress() {
		System.out.println("去衣柜找找看。。");
	}

	public void findPlaceOnMap() {
		System.out.println("在Map上找找。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		goClothespress();
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		findPlaceOnMap();
	}
}
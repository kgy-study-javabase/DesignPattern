package structurepattern.decorator.app.concretedecorator;

import structurepattern.decorator.app.decorator.Condiment;
import structurepattern.decorator.app.passivedecorator.Humburger;

/**
 * 具体装饰角色(Concrete Decorator)
 * 
 * 生菜（装饰者的第一层，相当于上面的DecoratorZero）
 * 
 * @author Administrator
 */
public class Lettuce extends Condiment {
	Humburger humburger;

	public Lettuce(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName() + " 加生菜";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice() + 1.5;
	}
}
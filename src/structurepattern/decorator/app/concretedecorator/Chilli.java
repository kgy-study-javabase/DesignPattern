package structurepattern.decorator.app.concretedecorator;

import structurepattern.decorator.app.decorator.Condiment;
import structurepattern.decorator.app.passivedecorator.Humburger;

/**
 * 具体装饰角色(Concrete Decorator)
 * 
 * 辣椒（装饰者的第二层，相当于上面的DecoratorFirst）
 * 
 * @author Administrator
 */
public class Chilli extends Condiment {
	Humburger humburger;

	public Chilli(Humburger humburger) {
		this.humburger = humburger;

	}

	@Override
	public String getName() {
		return humburger.getName() + " 加辣椒";
	}

	@Override
	public double getPrice() {
		// 辣椒是免费的哦
		return humburger.getPrice();
	}
}
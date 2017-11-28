package structurepattern.decorator.decorator.decorator;

import structurepattern.decorator.decorator.passivedecorator.Human;

/**
 * 定义装饰者
 * 
 * 装饰角色(Decorator)
 * 
 * @author Administrator
 */
public abstract class Decorator implements Human {
	private Human human;

	public Decorator(Human human) {
		this.human = human;
	}

	public void wearClothes() {
		human.wearClothes();
	}

	public void walkToWhere() {
		human.walkToWhere();
	}
}
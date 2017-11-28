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
public class DecoratorTwo extends Decorator {
	public DecoratorTwo(Human human) {
		super(human);
	}

	public void findClothes() {
		System.out.println("找到一件D&G。。");
	}

	public void findTheTarget() {
		System.out.println("在Map上找到神秘花园和城堡。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		findClothes();
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		findTheTarget();
	}
}
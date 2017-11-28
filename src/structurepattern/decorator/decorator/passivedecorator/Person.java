package structurepattern.decorator.decorator.passivedecorator;

/**
 * 定义被装饰者，被装饰者初始状态有些自己的装饰
 * 
 * @author Administrator
 */
public class Person implements Human {
	@Override
	public void wearClothes() {
		System.out.println("穿什么呢。。");
	}

	@Override
	public void walkToWhere() {
		System.out.println("去哪里呢。。");
	}
}
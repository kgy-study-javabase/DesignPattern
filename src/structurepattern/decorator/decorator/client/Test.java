package structurepattern.decorator.decorator.client;

import structurepattern.decorator.decorator.concretedecorator.DecoratorFirst;
import structurepattern.decorator.decorator.concretedecorator.DecoratorTwo;
import structurepattern.decorator.decorator.concretedecorator.DecoratorZero;
import structurepattern.decorator.decorator.decorator.Decorator;
import structurepattern.decorator.decorator.passivedecorator.Human;
import structurepattern.decorator.decorator.passivedecorator.Person;

/**
 * 测试类，看一下你就会发现，跟java的I/O操作有多么相似
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22713711
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Test {
	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new DecoratorTwo(new DecoratorFirst(new DecoratorZero(person)));
		decorator.wearClothes();
		decorator.walkToWhere();
	}
}
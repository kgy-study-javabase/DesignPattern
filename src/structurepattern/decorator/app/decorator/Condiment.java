package structurepattern.decorator.app.decorator;

import structurepattern.decorator.app.passivedecorator.Humburger;

/**
 * 定义装饰者
 * 
 * 装饰角色(Decorator)
 * 
 * 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料，相当于上面Decorator）
 * 
 * @author Administrator
 */
public abstract class Condiment extends Humburger {
	public abstract String getName();
}
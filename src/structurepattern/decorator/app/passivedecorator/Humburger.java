package structurepattern.decorator.app.passivedecorator;

/**
 * 定义被装饰者
 * 
 * 汉堡基类（被装饰者，相当于上面的Human）
 * 
 * @author Administrator
 */
public abstract class Humburger {
	protected String name;

	public String getName() {
		return name;
	}

	public abstract double getPrice();
}
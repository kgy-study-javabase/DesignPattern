package behaviorpattern.visitor.app.concreteelement;

import behaviorpattern.visitor.app.element.Element;
import behaviorpattern.visitor.app.visitor.IVisitor;

/**
 * 元素类
 * 
 * 具体元素角色（Concrete Element）
 * 
 * @author Administrator
 */
public class ConcreteElementSecond extends Element {
	@Override
	public void doSomething() {
		System.out.println("这是元素2");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
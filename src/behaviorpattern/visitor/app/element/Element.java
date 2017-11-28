package behaviorpattern.visitor.app.element;

import behaviorpattern.visitor.app.visitor.IVisitor;

/**
 * 抽象元素类
 * 
 * 元素角色（Element）
 * 
 * @author Administrator
 */
public abstract class Element {
	public abstract void accept(IVisitor visitor);

	public abstract void doSomething();
}
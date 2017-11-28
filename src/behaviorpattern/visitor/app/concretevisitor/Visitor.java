package behaviorpattern.visitor.app.concretevisitor;

import behaviorpattern.visitor.app.concreteelement.ConcreteElementFirst;
import behaviorpattern.visitor.app.concreteelement.ConcreteElementSecond;
import behaviorpattern.visitor.app.visitor.IVisitor;

/**
 * 访问者
 * 
 * 具体访问者角色（Concrete Visitor）
 * 
 * @author Administrator
 */
public class Visitor implements IVisitor {
	@Override
	public void visit(ConcreteElementFirst el1) {
		el1.doSomething();
	}

	@Override
	public void visit(ConcreteElementSecond el2) {
		el2.doSomething();
	}
}
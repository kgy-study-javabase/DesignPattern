package behaviorpattern.visitor.app.visitor;

import behaviorpattern.visitor.app.concreteelement.ConcreteElementFirst;
import behaviorpattern.visitor.app.concreteelement.ConcreteElementSecond;

/**
 * 抽象访问者
 * 
 * 访问者角色（Visitor）
 * 
 * @author Administrator
 */
public interface IVisitor {
	public void visit(ConcreteElementFirst el1);

	public void visit(ConcreteElementSecond el2);
}
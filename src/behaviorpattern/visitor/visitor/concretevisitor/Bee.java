package behaviorpattern.visitor.visitor.concretevisitor;

import behaviorpattern.visitor.visitor.concreteelement.Chrysanthemum;
import behaviorpattern.visitor.visitor.concreteelement.Gladiolus;
import behaviorpattern.visitor.visitor.concreteelement.Runuculus;
import behaviorpattern.visitor.visitor.visitor.Visitor;

/**
 * Add the ability to do "Bee" activities: 另一个具体访问者角色
 * 
 * 具体访问者角色（Concrete Visitor）
 * 
 * @author Administrator
 */
public class Bee implements Visitor {
	public void visit(Gladiolus g) {
		System.out.println("Bee and Gladiolus");
	}

	public void visit(Runuculus r) {
		System.out.println("Bee and Runuculus");
	}

	public void visit(Chrysanthemum c) {
		System.out.println("Bee and Chrysanthemum");
	}
}
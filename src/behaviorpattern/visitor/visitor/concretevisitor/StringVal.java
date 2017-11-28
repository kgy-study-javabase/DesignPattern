package behaviorpattern.visitor.visitor.concretevisitor;

import behaviorpattern.visitor.visitor.concreteelement.Chrysanthemum;
import behaviorpattern.visitor.visitor.concreteelement.Gladiolus;
import behaviorpattern.visitor.visitor.concreteelement.Runuculus;
import behaviorpattern.visitor.visitor.visitor.Visitor;

/**
 * Add the ability to produce a string: 实现的具体访问者角色
 * 
 * 具体访问者角色（Concrete Visitor）
 * 
 * @author Administrator
 */
public class StringVal implements Visitor {
	String s;

	public String toString() {
		return s;
	}

	public void visit(Gladiolus g) {
		s = "Gladiolus";
	}

	public void visit(Runuculus r) {
		s = "Runuculus";
	}

	public void visit(Chrysanthemum c) {
		s = "Chrysanthemum";
	}
}
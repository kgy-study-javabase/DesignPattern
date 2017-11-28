package behaviorpattern.visitor.visitor.visitor;

import behaviorpattern.visitor.visitor.concreteelement.Chrysanthemum;
import behaviorpattern.visitor.visitor.concreteelement.Gladiolus;
import behaviorpattern.visitor.visitor.concreteelement.Runuculus;

/**
 * 访问者角色（Visitor）
 * 
 * @author Administrator
 */
public interface Visitor {
	public void visit(Gladiolus g);

	public void visit(Runuculus r);

	public void visit(Chrysanthemum c);
}
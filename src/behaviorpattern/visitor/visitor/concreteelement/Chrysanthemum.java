package behaviorpattern.visitor.visitor.concreteelement;

import behaviorpattern.visitor.visitor.element.Flower;
import behaviorpattern.visitor.visitor.visitor.Visitor;

/**
 * 以下三个具体元素角色
 * 
 * 具体元素角色（Concrete Element）
 * 
 * @author Administrator
 */
public class Chrysanthemum implements Flower {
	@Override
	public void accept(Visitor v) {
		// 第二次分派
		v.visit(this);
	}
}
package behaviorpattern.visitor.visitor.element;

import behaviorpattern.visitor.visitor.visitor.Visitor;

/**
 * The Flower hierarchy cannot be changed
 * 
 * 元素角色（Element）
 * 
 * @author Administrator
 */
public interface Flower {
	public void accept(Visitor v);
}
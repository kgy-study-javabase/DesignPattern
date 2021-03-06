package structurepattern.bridge.concreteimplementor;

import structurepattern.bridge.abstraction.Shape;
import structurepattern.bridge.refinedabstraction.Drawing;

/**
 * 具体实现（ConcreteImplementor）角色
 * 
 * @author Administrator
 */
public class Circle implements Shape {
	private Drawing drawing;

	public Circle(Drawing drawing) {
		this.drawing = drawing;
	}

	@Override
	public void doDraw() {
		drawing.draw();
	}
}
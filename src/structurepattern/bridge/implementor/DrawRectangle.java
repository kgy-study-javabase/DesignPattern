package structurepattern.bridge.implementor;

import structurepattern.bridge.refinedabstraction.Drawing;

/**
 * 实现（Implementor）角色
 * 
 * @author Administrator
 */
public class DrawRectangle implements Drawing {
	public DrawRectangle() {
		System.out.println("Constructor DrawRectangle");
	}

	@Override
	public void draw() {
		System.out.println("DrawRectangle draw Rectangle");
	}
}
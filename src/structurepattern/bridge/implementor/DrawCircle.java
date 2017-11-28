package structurepattern.bridge.implementor;

import structurepattern.bridge.refinedabstraction.Drawing;

/**
 * 实现（Implementor）角色
 * 
 * @author Administrator
 */
public class DrawCircle implements Drawing {
	public DrawCircle() {
		System.out.println("Constructor DrawCircle");
	}

	@Override
	public void draw() {
		System.out.println("DrawCircle draw Circle");
	}
}
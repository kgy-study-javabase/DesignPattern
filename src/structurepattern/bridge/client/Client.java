package structurepattern.bridge.client;

import structurepattern.bridge.abstraction.Shape;
import structurepattern.bridge.concreteimplementor.Circle;
import structurepattern.bridge.concreteimplementor.Rectangle;
import structurepattern.bridge.implementor.DrawCircle;
import structurepattern.bridge.implementor.DrawRectangle;

/**
 * 测试类 参考URL： http://www.doc88.com/p-381368642949.html
 * http://www.cnblogs.com/java-my-life/archive/2012/05/07/2480938.html
 * http://blog.csdn.net/ymeng_bupt/article/details/6834406
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Shape shape = new Circle(new DrawCircle());
		shape.doDraw();

		shape = new Rectangle(new DrawRectangle());
		shape.doDraw();
	}
}
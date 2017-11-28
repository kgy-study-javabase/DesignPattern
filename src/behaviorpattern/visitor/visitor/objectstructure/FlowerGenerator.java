package behaviorpattern.visitor.visitor.objectstructure;

import java.util.Random;

import behaviorpattern.visitor.visitor.concreteelement.Chrysanthemum;
import behaviorpattern.visitor.visitor.concreteelement.Gladiolus;
import behaviorpattern.visitor.visitor.concreteelement.Runuculus;
import behaviorpattern.visitor.visitor.element.Flower;

/**
 * 这是一个对象生成器 这不是一个完整的对象结构，这里仅仅是模拟对象结构中的元素
 * 
 * 对象结构角色（Object Structure）
 * 
 * @author Administrator
 */
public class FlowerGenerator {
	private static Random rand = new Random();

	public static Flower newFlower() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Gladiolus();
		case 1:
			return new Runuculus();
		case 2:
			return new Chrysanthemum();
		}
	}
}
package structurepattern.flyweight.concreteflyweight;

import structurepattern.flyweight.flyweight.Flyweight;

/**
 * 实现一个具体类
 * 
 * 具体享元角色(Concrete Flyweight)
 * 
 * @author Administrator
 */
public class ConcreteFlyweight extends Flyweight {
	private String string;

	public ConcreteFlyweight(String str) {
		string = str;
	}

	public void operation() {
		System.out.println("Concrete---Flyweight : " + string);
	}
}
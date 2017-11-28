package structurepattern.flyweight.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import structurepattern.flyweight.concreteflyweight.ConcreteFlyweight;
import structurepattern.flyweight.flyweight.Flyweight;

public class FlyweightFactory {
	// ----------------------------1
	private Map<Object, Flyweight> flyweights = new HashMap<Object, Flyweight>();

	public FlyweightFactory() {
	}

	public Flyweight getFlyWeight(Object obj) {
		// ----------------2
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			// ---------------------------------------------------3
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String) obj);
			// --------------------------------------5
			flyweights.put(obj, flyweight);
		}
		// ---------------------------------------------------------6
		return flyweight;
	}

	public int getFlyweightSize() {
		return flyweights.size();
	}
}

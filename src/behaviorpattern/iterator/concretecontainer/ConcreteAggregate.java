package behaviorpattern.iterator.concretecontainer;

import java.util.ArrayList;
import java.util.List;

import behaviorpattern.iterator.concreteiterator.ConcreteIterator;
import behaviorpattern.iterator.container.Aggregate;
import behaviorpattern.iterator.iterator.Iterator;

/**
 * 具体容器角色（Concrete Container）
 * 
 * @author Administrator
 */
public class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<Object>();

	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(list);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}
}
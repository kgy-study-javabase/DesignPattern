package behaviorpattern.iterator.concreteiterator;

import java.util.ArrayList;
import java.util.List;

import behaviorpattern.iterator.iterator.Iterator;

/**
 * 具体迭代器角色（Concrete Iterator）
 * 
 * @author Administrator
 */
public class ConcreteIterator implements Iterator {
	private List<Object> list = new ArrayList<Object>();

	private int cursor = 0;

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (cursor == list.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (this.hasNext()) {
			obj = this.list.get(cursor++);
		}
		return obj;
	}
}
package behaviorpattern.iterator.container;

import behaviorpattern.iterator.iterator.Iterator;

/**
 * 容器角色（Container）
 * 
 * @author Administrator
 */
public interface Aggregate {
	public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();
}
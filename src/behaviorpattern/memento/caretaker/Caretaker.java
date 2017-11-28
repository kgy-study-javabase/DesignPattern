package behaviorpattern.memento.caretaker;

import behaviorpattern.memento.memento.MementoIF;

/**
 * 备忘录管理者（Caretaker）角色
 * 
 * @author Administrator
 */
public class Caretaker {
	private MementoIF m;

	public void saveMemento(MementoIF m) {
		this.m = m;
	}

	public MementoIF getMemento() {
		return m;
	}
}
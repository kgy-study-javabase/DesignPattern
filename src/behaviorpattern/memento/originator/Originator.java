package behaviorpattern.memento.originator;

import behaviorpattern.memento.caretaker.Caretaker;
import behaviorpattern.memento.memento.MementoIF;

/**
 * 备忘发起（Originator）角色
 * 
 * @author Administrator
 */
public class Originator {
	/**
	 * 这个是要保存的状态
	 */
	private int state = 90;

	/**
	 * 保持一个"备忘录管理者角色"的对象
	 */
	private Caretaker c = new Caretaker();

	/**
	 * 读取备忘录角色以恢复以前的状态
	 */
	public void setMemento() {
		Memento memento = (Memento) c.getMemento();
		state = memento.getState();
		System.out.println("the state is " + state + " now");
	}

	/**
	 * 创建一个备忘录角色，并将当前状态属性存入，托给"备忘录管理者角色"存放。
	 */
	public void createMemento() {
		c.saveMemento(new Memento(state));
	}

	/**
	 * this is other business methods...
	 * 
	 * they maybe modify the attribute state
	 * 
	 * @param m
	 */
	public void modifyState4Test(int m) {
		state = m;
		System.out.println("the state is " + state + " now");
	}

	/**
	 * 备忘录（Memento）角色
	 * 
	 * 作为私有内部类的备忘录角色，它实现了窄接口，可以看到在第二种方法中宽接口已经不再需要
	 * 
	 * 注意：里面的属性和方法都是私有的
	 * 
	 * @author Administrator
	 */
	private class Memento implements MementoIF {
		private int state;

		private Memento(int state) {
			this.state = state;
		}

		private int getState() {
			return state;
		}
	}
}
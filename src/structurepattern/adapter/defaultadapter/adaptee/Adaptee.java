package structurepattern.adapter.defaultadapter.adaptee;

import structurepattern.adapter.defaultadapter.target.InterfaceFirst;

/**
 * 被适配(Adaptee)角色
 * 
 * @author Administrator
 */
public abstract class Adaptee implements InterfaceFirst {
	protected Adaptee() {
		System.out.println("construction Adaptee");
	}

	@Override
	public void methodFirst() {
		System.out.println("Adaptee methodFirst");
	}

	@Override
	public void methodSecond() {
		System.out.println("Adaptee methodSecond");
	}

	@Override
	public void methodThird() {
		System.out.println("Adaptee methodThird");
	}

	@Override
	public void methodFourth() {
		System.out.println("Adaptee methodFourth");
	}
}
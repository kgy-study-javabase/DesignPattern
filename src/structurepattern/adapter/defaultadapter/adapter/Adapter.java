package structurepattern.adapter.defaultadapter.adapter;

import structurepattern.adapter.defaultadapter.adaptee.Adaptee;

/**
 * 适配器(Adapter)角色
 * 
 * @author Administrator
 */
public class Adapter extends Adaptee {
	public Adapter() {
		super();
		System.out.println("construction Adapter");
	}
	
	@Override
	public void methodFirst() {
		System.out.println("Adapter methodFirst");
	}

	@Override
	public void methodThird() {
		System.out.println("Adapter methodThird");
	}
}
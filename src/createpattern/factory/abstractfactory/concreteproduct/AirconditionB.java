package createpattern.factory.abstractfactory.concreteproduct;

import createpattern.factory.abstractfactory.abstractproduct.Aircondition;

/**
 * 空调以及型号
 * 
 * 产品类
 * 
 * 具体产品(Concrete Product)角色
 * 
 * @author Administrator
 */
public class AirconditionB implements Aircondition {
	public AirconditionB() {
		System.out.println("制造-->AirconditionA");
	}
}
package createpattern.factory.abstractfactory.concretefactory;

import createpattern.factory.abstractfactory.abstractfactory.AbstractFactory;
import createpattern.factory.abstractfactory.abstractproduct.Aircondition;
import createpattern.factory.abstractfactory.abstractproduct.Engine;
import createpattern.factory.abstractfactory.concreteproduct.AirconditionA;
import createpattern.factory.abstractfactory.concreteproduct.EngineA;

/**
 * 为宝马320系列生产配件
 * 
 * 具体工厂(Concrete Factory)角色
 * 
 * @author Administrator
 */
public class FactoryBMW320 implements AbstractFactory {
	public FactoryBMW320() {
		System.out.println("制造宝马320系列");
	}

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}
}
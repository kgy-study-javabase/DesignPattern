package createpattern.factory.abstractfactory.concretefactory;

import createpattern.factory.abstractfactory.abstractfactory.AbstractFactory;
import createpattern.factory.abstractfactory.abstractproduct.Aircondition;
import createpattern.factory.abstractfactory.abstractproduct.Engine;
import createpattern.factory.abstractfactory.concreteproduct.AirconditionB;
import createpattern.factory.abstractfactory.concreteproduct.EngineB;

/**
 * 为宝马523系列生产配件
 * 
 * 具体工厂(Concrete Factory)角色
 * 
 * @author Administrator
 */
public class FactoryBMW523 implements AbstractFactory {
	public FactoryBMW523() {
		System.out.println("制造宝马523系列");
	}

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}
}
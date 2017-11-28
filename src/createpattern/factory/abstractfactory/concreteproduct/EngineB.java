package createpattern.factory.abstractfactory.concreteproduct;

import createpattern.factory.abstractfactory.abstractproduct.Engine;

/**
 * 发动机以及型号
 * 
 * 产品类
 * 
 * 具体产品(Concrete Product)角色
 * 
 * @author Administrator
 */
public class EngineB implements Engine {
	public EngineB() {
		System.out.println("制造-->EngineB");
	}
}
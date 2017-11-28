package createpattern.factory.abstractfactory.abstractfactory;

import createpattern.factory.abstractfactory.abstractproduct.Aircondition;
import createpattern.factory.abstractfactory.abstractproduct.Engine;

/**
 * 创建工厂的接口
 * 
 * 抽象工厂(Abstract Factory)角色
 * 
 * @author Administrator
 */
public interface AbstractFactory {
	/**
	 * 制造发动机
	 * 
	 * @return
	 */
	public Engine createEngine();

	/**
	 * 制造空调
	 * 
	 * @return
	 */
	public Aircondition createAircondition();
}
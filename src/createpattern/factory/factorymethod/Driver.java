package createpattern.factory.factorymethod;

import createpattern.factory.common.Car;

/**
 * 抽象产品角色，具体产品角色与简单工厂模式类似，只是变得复杂了些，这里略。 
 * 抽象工厂角色
 * 
 * @author Administrator
 */
public interface Driver {
	public Car driverCar();
}
package createpattern.factory.simplefactory;

import createpattern.factory.common.Benz;
import createpattern.factory.common.Bmw;
import createpattern.factory.common.Car;

/**
 * 工厂类角色
 * 
 * @author Administrator
 */
public class Driver {
	/**
	 * 工厂方法.注意返回类型为抽象产品角色
	 * 
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public static Car driverCar(String s) throws Exception {
		// 判断逻辑，返回具体的产品角色给Client
		if (s.equalsIgnoreCase("Benz")) {
			return new Benz();
		} else if (s.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		} else {
			throw new Exception();
		}
	}
}
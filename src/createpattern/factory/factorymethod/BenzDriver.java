package createpattern.factory.factorymethod;

import createpattern.factory.common.Benz;
import createpattern.factory.common.Car;

public class BenzDriver implements Driver {
	@Override
	public Car driverCar() {
		return new Benz();
	}
}
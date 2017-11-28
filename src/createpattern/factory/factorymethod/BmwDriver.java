package createpattern.factory.factorymethod;

import createpattern.factory.common.Bmw;
import createpattern.factory.common.Car;

public class BmwDriver implements Driver {
	@Override
	public Car driverCar() {
		return new Bmw();
	}
}
package createpattern.factory.factorymethod;

import createpattern.factory.common.Car;

public class Magnate {
	public static void main(String[] args) {
		try {
			Driver driver = new BenzDriver();
			driver = new BmwDriver();
			Car car = driver.driverCar();
			car.drive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
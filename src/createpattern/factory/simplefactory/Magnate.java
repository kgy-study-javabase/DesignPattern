package createpattern.factory.simplefactory;

import createpattern.factory.common.Car;

public class Magnate {
	public static void main(String[] args) {
		try {
			// 告诉司机我今天坐奔驰
			Car car = Driver.driverCar("bmw");
			// 下命令：开车
			car.drive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
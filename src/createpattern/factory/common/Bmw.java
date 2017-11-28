package createpattern.factory.common;

/**
 * 具体产品角色
 * 
 * @author Administrator
 */
public class Bmw implements Car {
	@Override
	public void drive() {
		System.out.println("Driving Bmw");
	}
}
package createpattern.factory.common;

/**
 * 具体产品角色
 * 
 * @author Administrator
 */
public class Benz implements Car {
	@Override
	public void drive() {
		System.out.println("Driving Benz");
	}
}